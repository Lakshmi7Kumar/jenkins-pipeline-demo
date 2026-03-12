pipeline {
    agent any

    stages {

        stage('Clone Repo') {
            steps {
                git 'https://github.com/YOUR_USERNAME/pipeline-project.git'
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
