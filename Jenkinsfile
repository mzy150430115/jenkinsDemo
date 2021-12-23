pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '51735b31-e4cc-475d-8b5e-a7d4cb4c5e5c', url: 'git@github.com:mzy150430115/jenkinsDemo.git']]])
            }
        }
        stage('build project') {
            steps {
                 sh 'mvn clean package'
            }
        }
        stage('publish project') {
            steps {
                 deploy adapters: [tomcat9(credentialsId: '5fcb3dbd-589c-47fa-a637-4935d2e3e7c9', path: '', url: 'http://123.56.100.91:8080/')], contextPath: null, war: 'target/*.war'
            }
        }

    }

}
