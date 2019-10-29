pipeline {
    agent any

    stages {
        stage('Test SuiteCreateUsers') {
            steps {
                echo 'Building..'
                bat(".\\gradlew.bat -s clean test")
            }
        }
    }
}