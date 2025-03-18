def call(String reportName) {
    archiveArtifacts artifacts: reportName, fingerprint: true
}
