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
                sh 'mvn clean package'
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
                echo 'Deploying in Docker'
                echo 'pwd'
                echo 'ls -ltr'
                sh 'docker build --tag=maventest1:0.0.1 .'
                sh 'docker run -p8887:8888 maventest1:latest'
            }
        }
    }
}