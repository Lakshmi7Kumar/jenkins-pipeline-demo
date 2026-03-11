pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                echo "Cloning repository"
            }
        }

        stage('Build') {
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
