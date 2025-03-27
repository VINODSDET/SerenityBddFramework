pipeline {
    agent any

    environment {
        CHROME_DRIVER = '/usr/local/bin/chromedriver'  // Path to ChromeDriver
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/VINODSDET/SerenityBddFramework.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generate Test Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'  // JUnit reports
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
        success {
            echo 'Test execution successful!'
        }
        failure {
            echo 'Test execution failed!'
        }
    }
}
