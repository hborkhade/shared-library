class Load implements Serializable {
    
    def projectName
    def serverDomain
    def dynamicProperty
    
    Load(script) {
      this.projectName = "Project2"
      this.serverDomain = "Project2 server domain"
      this.dynamicProperty = "${script.env.MSG} this is Dynamic property"
        sh "echo 'From Library ${this.dynamicProperty}'"
    }
  
}
