using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GardeningShop
{
    public class StanKoszyka
    {
        public StanKoszyka()
        {
            listaZakupow = new List<KoszykRekord>();
            PrzeliczCene();
        }
        public List<KoszykRekord> listaZakupow;
        public float cenaCalkowita;

        public void DodajDoKoszyka(KoszykRekord rekord)
        {
            foreach(KoszykRekord rec in listaZakupow)
            {
                if (rec.Itemname.Equals(rekord.Itemname))
                {
                    rec.SetIlosc(rec.GetIlosc() + 1);
                    PrzeliczCene();
                    return;
                }

            }
            listaZakupow.Add(rekord);
            PrzeliczCene();
        }

        void PrzeliczCene()
        {
            float nowacena = 0;
            foreach (KoszykRekord re in listaZakupow)
            {
                nowacena += re.Cena_zwyk * re.GetIlosc();
            }

            cenaCalkowita = nowacena;
        }

    }
}
