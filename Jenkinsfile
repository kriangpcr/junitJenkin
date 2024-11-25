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
                // รัน unit tests โดยใช้ Maven หรือคำสั่งของคุณเอง
                script {
                    // ตัวอย่างการรัน unit tests ด้วย Maven
                    sh 'mvn test'  // ใช้คำสั่งนี้ถ้าคุณใช้ Maven
                }
            }
            post {
                always {
                    // ใช้เพื่อแสดงผลลัพธ์การทดสอบ JUnit หลังจากรันเสร็จ
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
