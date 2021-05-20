object ExamenBigData {
  def main(args: Array[String]): Unit = {
    println("Fonction principale")
    val l1 : List[String] = List("julien", "Paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")
    println(renvoiListe(l1))
    liste_double()
  }

  def renvoiListe(list : List[String]): List[String] = {
    val list2 = list.filter(s => (s.charAt(s.length-1) == 'n'))
    return list2
  }

  def liste_double(): Unit ={
    val  maListe = List(List("ecommercemar.fr"," "),List("https://www.journalducm.com/contact/","Payant"),
      List("https://www.zatsaz.com/",""),List("https://www.lerevenu.com",""),
      List("https://www.cadre-dirigeant-magazine.com/","payant"),
      List("https://www.silicon.fr/services/contact#annoncer/","Payant"),
      List("https://www.channelbiz.fr/nous-contacter/",""),
      List("https://www.itespresso.fr/",""),
      List("https://www.industrie-mag.com/article4.html","invite"),
      List("https://www.jesuisundev.com/article-invite/","invite"),
      List("https://www.numerama.com/",""))
    maListe.foreach(l=>{println(l(0)+" "+l(1))})
  }

}
