def call(String imagename, String tag, String username){
  sh"docker build -t ${username}/${imagename}:${tag} ."
}
