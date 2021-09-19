pipeline {
    agent any

    def app
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }
//         stage('Build') {
//             steps {
//                 echo 'Building..'
//                 sh 'mvn clean package'
//                 archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
//             }
//         }
        stage('Docker Build') {
            steps {
                echo 'Building Docker Image'
                app = docker.build("maventest1")
            }
        }

        stage('Docker Push') {
            docker.withRegistry('https://registry.hub.docker.com', '2733f4cc-eebe-462f-a80d-a95154fcc41f') {
                        app.push("${env.BUILD_NUMBER}")
                        app.push("latest")
                    }
        }
//         stage('Test') {
//             steps {
//                 echo 'Testing..'
//             }
//         }
//
//         stage('Deploy') {
//             steps {
//                 echo 'Deploying in Docker'
//                 sh 'pwd'
//                 sh 'ls -ltr'
//                 sh 'docker build --tag=maventest1:0.0.1 .'
//                 sh 'docker run -p8887:8888 maventest1:latest'
//             }
//         }
    }
}