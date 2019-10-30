pipeline {
    agent any

    stages {
        stage('Test SuiteCreateUsers') {
            steps {
                echo 'Building..'
                script {
                    try {
                        sh './gradlew clean test' //run a gradle task
                    } finally {
                        junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
                    }
                }
            }
        }
    }
}./