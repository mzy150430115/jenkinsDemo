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
    }

}
