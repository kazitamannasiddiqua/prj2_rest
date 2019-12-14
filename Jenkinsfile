pipeline{
    agent any
        tools {
                maven "m3"
                        jdk "JDK8"

                            }
                                triggers {
                                        pollSCM("* * * * *")
                                            }
                                                stages {
                                                    stage('compile'){
                                                            steps{
                                                                        sh 'mvn clean compile'
                                                                                }
                                                                                    }
                                                                                        stage('package') {
                                                                                                steps{
                                                                                                            sh "mvn package"
                                                                                                                    }
                                                                                                                        }
                                                                                                                          }  post {
                                                                                                                                    success {
                                                                                                                                                sh "echo HURRAY"
                                                                                                                                                        }
                                                                                                                                                            }
                                                                                                                                                       
                                                                                                                                                           }
