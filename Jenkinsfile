pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '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', url: 'git@github.com:mzy150430115/jenkinsDemo.git']]])
            }
        }
        stage('build project') {
            steps {
                 sh "if (ps -ef|grep jdemo-0.0.1-SNAPSHOT.war|grep -v grep)then(ps -ef| grep jdemo-0.0.1-SNAPSHOT.war|grep -v grep | awk '{print \$2}'|xargs kill -9) fi"

                 sh "mvn clean package "

                 sh "export BUILD_ID='dontKillMe'"
                 sh "JENKINS_NODE_COOKIE=dontKillMe nohup java -jar /root/.jenkins/workspace/test01/target/jdemo-0.0.1-SNAPSHOT.war &"
            }
        }


    }

}
