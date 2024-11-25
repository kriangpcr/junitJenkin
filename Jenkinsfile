pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // ดึงโค้ดจาก Git repository
                checkout scm
            }
        }

        stage('Run Unit Tests') {
            steps {
                // รัน unit tests โดยใช้ Maven
                script {
                    // รันคำสั่ง Maven เพื่อทดสอบ
                    sh 'mvn clean test'  // ใช้คำสั่งนี้เพื่อทำความสะอาดก่อนและรันการทดสอบ
                }
            }
            post {
                always {
                    // ใช้เพื่อแสดงผลลัพธ์การทดสอบ JUnit
                    junit '**/target/test-*.xml'  // ที่อยู่ไฟล์ JUnit reports (สำหรับ Maven)
                }
            }
        }
    }

    post {
        success {
            // เมื่อการทดสอบทั้งหมดผ่าน
            echo 'All tests passed!'
        }
        failure {
            // เมื่อการทดสอบล้มเหลว
            echo 'Tests failed, stopping pipeline!'
        }
    }
}
