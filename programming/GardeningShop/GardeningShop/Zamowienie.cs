using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GardeningShop
{
    public class Zamowienie
    {
        public Zamowienie(StanKoszyka stanK)
        {
            this.stan = stanK;
            this.idZamowienia = przypiszID();
        }

        StanKoszyka stan;
        long idZamowienia;

        private long przypiszID()
        {
            long data = DateTime.Now.Ticks;
            return data + (long)Math.Pow(10, 19);
        }
    }
}
