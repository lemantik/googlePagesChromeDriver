pipeline {
    agent any

    stages {
        stage('Test SuiteCreateUsers') {
            steps {
                echo 'Building..'
                script {
                    try {
                        sh './gradlew test
                }
            }
        }
    }
}