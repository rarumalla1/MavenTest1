pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}