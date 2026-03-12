pipeline {
    agent any

    stages {

        stage('Clone Repo') {
            steps {
                git 'https://github.com/Lakshmi7Kumar/jenkins-pipeline-demo.git'
            }
            }
        
        stage('Build Java') {
            steps {
                sh 'javac Hello.java'
            }
        }

        stage('Run Program') {
            steps {
                sh 'java Hello'
            }
        }

    }
}
