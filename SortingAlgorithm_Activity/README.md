Sorting Algorithms Activity

Unsa ang gibuhat sa akong program?

Ang akong Java program  nag-sort ko og usa ka array nga naay 10 ka numero gikan sa gamay padulong sa dako (ascending). Nag gamit ko og tulo ka lahi nga paagi: Bubble Sort, Selection Sort, ug Insertion Sort. Sa `main()`, naghimo ko og tulo ka kopya sa original nga array aron ang isig ka algorithm magsugod sa parihas nga unsorted nga numero. Human niana, gi-print nako ang original nga array ug ang resulta sa isig ka sorting method aron makita nga parihas ang kataposang han-ay.

Original array: `{64, 25, 12, 22, 11, 90, 5, 78, 33, 47}`

Resulta sa tanan: `[5, 11, 12, 22, 25, 33, 47, 64, 78, 90]`

 Unsaon pag-work sa Bubble Sort?

Gikumpara kini ang duha ka magkatapad nga numero. Kung mas dako ang numero sa wala kaysa sa numero sa tuo, gi baylo sila. Balik balikon kini gikan sa sinugdanan hangtod sa katapusan sa array. Human sa matag palibot, ang pinakadako nga numero mo-"bubble" o moagi paingon sa katapusan. Balikon ang proseso hangtod wala nay swap nga mahitabo, pasabot ani sorted na.

 Unsaon pag-work sa Selection Sort?

Pangitaon niini ang pinakagamay nga numero sa tibuok nga bahin nga wala pa na-sort, dayon i-baylo kini sa numero nga naa sa pinaka una nga posisyon sa bahin nga wala pa na-sort. Dayon sunod na pud ang ikaduha nga posisyon, ug mao nay padayon. Matag palibot, usa ka numero ang mapahimutang sa iyang sakto nga lugar nga dili na ma utro.

 Unsaon pag-work sa Insertion Sort?

Gi isip niini nga sorted na ang unang numero. Dayon kuhaon ang sunod nga numero ug itandi sa mga numero sa wala niini. Ang mga numero nga mas dako ipa isbog sa tuo hangtod makita ang saktong lugar, dayon ibutang didto ang numero. Parehas kini sa pag-han-ay sa baraha sa kamot: kuhaon nimo ang bag-ong baraha ug isulod sa tunga sa mga baraha nga han-ay na.

Unsa ang kalainan sa tulo?

| Algorithm | Paagi | Swap / Usab | Maayo kung |
|---|---|---|---|
| Bubble Sort | Magkatapad nga numero ang gikumpara ug ginaswap | Daghan kaayo og balhin | Gamay ra ang data ug gusto lang og simple |
| Selection Sort | Pangitaon ang pinakagamay ug ibutang sa unahan | Gamay ra ang balhin (usa matag palibot) | Dili maayo ang daghang swap |
| Insertion Sort | Isulod ang numero sa saktong lugar sa sorted nga bahin | Moatras/mo-usog sa mga numero imbes swap | Halos sorted na ang data |

Ang tulo adunay parehas nga kinatibuk-ang bilis nga mahinay kung daghan na ang numero (mga O(n²)), apan lahi ang ilang paagi sa pag-arrange ug sa gidaghanon sa gibuhat nga trabaho.

 Reflection Questions

1. Unsaon sa matag sorting algorithm pag-arrange sa numero? Unsay nakapalahi sa ilang proseso?

Ang Bubble Sort nag-ayo sa mga numero pinaagi sa pagtandi sa duha ka magkatapad ug pag-swap hangtod moabot ang dagko sa katapusan. Ang Selection Sort mangita sa pinakagamay ug ibutang kini sa unahan. Ang Insertion Sort mokuha og usa ka numero ug isulod kini sa saktong lugar sa bahin nga sorted na. Ang nakapalahi nila mao ang paagi sa pagpili ug pagbalhin sa numero: ang Bubble naggamit og daghang swap sa magkatapad, ang Selection nagpangita una sa pinakagamay, ug ang Insertion nagsulod sa numero sa sorted nga bahin.

2. Hain ang labing sayon sabton ug i-implement, ug ngano?

Sa akong hunahuna ang **Selection Sort** ang labing sayon sabton kay klaro ang ideya: pangitaa ang pinakagamay, ibutang sa unahan, balika. Pero ang **Bubble Sort** sayon pud kaayo i-code kay duha ra ka loop ug usa ka swap. Pinaagi sa Bubble Sort, dali makita unsaon pag-usab sa han-ay sa matag lakang. Mas lisod gamay ang Insertion Sort kay naay `while` loop ug pag-usog sa mga numero.

3. Kung sorted na ang mga numero, hain ang mas maayo ug ngano?

Ang Insertion Sort (ug ang Bubble Sort nga naay `swapped` check) mas maayo kung sorted na ang numero. Sa Insertion Sort, wala nay kinahanglan nga usogon kay ang matag numero mas dako na sa nawong niini, mao nga usa ra ka tandi ang mahimo matag numero. Ang Bubble Sort nga naay `swapped` flag mohunong dayon human sa unang palibot kung wala nay swap. Ang Selection Sort mohimo gihapon sa tanang tandi bisan sorted na ang data kay kinahanglan gihapon niya pangitaon ang pinakagamay matag palibot.

4. Unsa ang mahitabo kung dugangan nako ang numero sa array?

Kung daghan na ang numero, motaas kaayo ang gidaghanon sa mga tandi ug usab nga kinahanglan buhaton, mao nga mohinay ang tanang tulo. Ang matag usa niini mga O(n²), mao nga kung doblehon ang gidaghanon sa numero, mga upat ka pilo ang dugang nga trabaho. Ang Bubble Sort kasagaran ang labing mahinay tungod sa daghang swap. Ang Selection Sort stable ang kinatibuk-ang oras apan gamay ang swap. Ang Insertion Sort mas maayo gihapon kung halos sorted na ang data. Para sa dagko kaayo nga data, mas maayo gamiton ang lahi nga mas paspas nga algorithm.

5. Ngano importante nga masabtan nako ang lainlaing sorting algorithms imbes usa ra ang gamiton?

Kay lahi-lahi ang sitwasyon sa data. Ang usa ka algorithm mahimong maayo para sa gamay o halos sorted na nga data, apan dili maayo sa uban. Kung nasabtan nako ang ilang kalainan, makapili ko sa labing angay nga paagi para sa trabaho, makahimo og mas episyente nga programa, ug mas maayo ang akong paghunahuna sa pag-solve og problema. Dugang pa, ang pagsabot sa mga basic nga algorithm mao ang pundasyon sa pagkat-on sa mas komplikado nga mga algorithm sa umaabot.
