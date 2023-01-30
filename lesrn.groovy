def call(Map params = [:]) {
    def Library = new Library(this, scm, env, params, currentBuild)

    pipeline {
        agent {
            label = "build"
        }

        stages {
            stage('dev') {
                steps {
                    script {

                    }
                }
            }

            post {
                always {
                    script {
                        sh "echo rashi"
                    }

                }
            }

            when {
                allof {
                    expression {
                        "${params.skipGenerateDBSchema}".toBoolean() != true
                    }

                    anyof{
                        expression{
                            env.GIT_BRANCH == "origin/master"
                        }
                        expression{

                        }
                    }
                }
            }

            stae('qa ') {
                ste ps {
                    scri pt {
                        steps.sh "echo "

                    }
                }
            }
        }
    }
}