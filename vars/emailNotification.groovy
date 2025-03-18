def call(String status, String recipientEmail, String reportName) {
    def subject = "Jenkins Build ${status}: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
    def body = """Hello,

The Jenkins pipeline *${env.JOB_NAME}* has ${status.toLowerCase()} on *Build #${env.BUILD_NUMBER}*.

*Job Details:*
- *Job Name:* ${env.JOB_NAME}
- *Build Number:* ${env.BUILD_NUMBER}
- *Build URL:* ${env.BUILD_URL}

Please review the attached Gitleaks scan report for more details.

Best regards,
Jenkins CI
"""

    emailext(
        to: recipientEmail,
        subject: subject,
        body: body,
        attachmentsPattern: reportName
    )
}
