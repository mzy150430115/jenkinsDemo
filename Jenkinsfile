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
                 sh "  if [ `ps -ef | grep jdemo-0.0.1 | awk '{print $2}'` ];then
                             . .venv/bin/activate
                     		ps -ef | grep jdemo-0.0.1 | awk '{print $2}' | xargs kill -9
                         fi"

                 sh "mvn clean package "

                 sh "export BUILD_ID='dontKillMe'"
                 sh "JENKINS_NODE_COOKIE=dontKillMe nohup java -jar /root/.jenkins/workspace/test03/target/jdemo-0.0.1-SNAPSHOT.war &"
            }
        }


    }

}
