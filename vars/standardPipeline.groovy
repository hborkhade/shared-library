
def call(body) {
        
        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()

        node {
            // Clean workspace before doing anything
            deleteDir()

            try {
                
                stage ('Build') {
                        echo 'building ' config.projectName ' ...'
                        //config.projectName = "Project2"
                }
                stage ('Tests') {
                    parallel 'static': {
                        echo 'shell scripts to run static tests...'
                    },
                    'unit': {
                        echo 'shell scripts to run unit tests...'
                    },
                    'integration': {
                        echo 'shell scripts to run integration tests...'
                    }
                }
                stage ('Deploy') {
                        echo 'deploying to server ' config.serverDomain ' ...'
                        //config.serverDomain = "Project2 Server Domain"
                }
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
        
        def projectName() {return "Project2"}
        def serverDomain() {return "Project2 Server Domain"}
    }
