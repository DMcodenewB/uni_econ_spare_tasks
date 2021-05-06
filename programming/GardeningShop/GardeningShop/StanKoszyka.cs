using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GardeningShop
{
    public class StanKoszyka
    {
        StanKoszyka()
        {
            listaZakupow = new List<KoszykRekord>();
            PrzeliczCene();
        }
        List<KoszykRekord> listaZakupow;
        float cenaCalkowita;

        public void DodajDoKoszyka(KoszykRekord rekord)
        {
            listaZakupow.Add(rekord);
            PrzeliczCene();
        }

        void PrzeliczCene()
        {
            float nowacena = 0;
            foreach (KoszykRekord re in listaZakupow)
            {
                nowacena += re.GetItem().price * re.GetIlosc();
            }

            cenaCalkowita = nowacena;
        }

    }
}
