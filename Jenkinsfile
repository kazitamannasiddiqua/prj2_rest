pipeline{
    agent any
        tools {
                maven "m3"
                        jdk "JDK3"

                            }
                                trigger {
                                        pollSCM("* * * * *")
                                            }
                                                stages {
                                                    stage('compile'){
                                                            steps{
                                                                        sh 'mvn clean compile'
                                                                                }
                                                                                    }
                                                                                        stage {
                                                                                                steps{
                                                                                                            sh "mvn package"
                                                                                                                    }
                                                                                                                        }
                                                                                                                            post {
                                                                                                                                    success {
                                                                                                                                                sh "echo HURRAY"
                                                                                                                                                        }
                                                                                                                                                            }
                                                                                                                                                            }
                                                                                                                                                            }
