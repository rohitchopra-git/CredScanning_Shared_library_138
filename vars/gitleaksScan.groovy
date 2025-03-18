def call(String reportName) {
    sh "gitleaks detect -r ${reportName}"
}
