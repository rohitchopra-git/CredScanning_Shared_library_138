def call(String reportName) {
    sh """
        gitleaks detect -r ${reportName} -f json
        gitleaks detect -f table
    """
}
