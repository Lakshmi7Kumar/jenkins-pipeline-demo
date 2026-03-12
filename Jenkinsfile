pipeline {

    agent any

    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['dev', 'test', 'prod'],
            description: 'Choose deployment environment'
        )
    }

    environment {
        APP_NAME = "HelloPipelineApp"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Lakshmi7Kumar/jenkins-pipeline-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac Hello.java'
            }
        }

        stage('Test') {
            steps {
                sh 'javac HelloTest.java'
                sh 'java HelloTest'
            }
        }

        stage('Package') {
            steps {
                sh 'jar cvf hello.jar Hello.class'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying ${APP_NAME} to ${params.ENVIRONMENT}"
            }
        }

    }
}
