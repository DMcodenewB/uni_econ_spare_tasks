using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace GardeningShop
{
    public class Zamowienie
    {
        public Zamowienie(StanKoszyka stanK)
        {
            this.listazakupow = stanK.listaZakupow;
            this.Cena_Calk = stanK.cenaCalkowita;
            this.idZamowienia = przypiszID();

            zapiszZamowienie();
        }

        public List<KoszykRekord> listazakupow;
        public float Cena_Calk;
        public string idZamowienia;

        private string przypiszID()
        {
            long data = DateTime.Now.Ticks;
            return "1000" + data.ToString();
        }
        private void zapiszZamowienie()
        {
            StreamWriter writer = new StreamWriter("../../Zamowienia.csv");

            string output = "";
            output += idZamowienia;
            output += ",";
            foreach(KoszykRekord rek in listazakupow)
            {
                output += rek.Itemname + ";" + rek.Ilosc.ToString() + ";" + rek.Cena_sum.ToString();
            }
            output += ",";
            output += Cena_Calk.ToString("0.00");

            writer.WriteLine(output);

            writer.Close();

        }
    }
}
