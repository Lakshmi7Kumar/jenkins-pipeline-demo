pipeline {
    agent any

    stages {
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
