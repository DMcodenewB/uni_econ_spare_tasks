using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GardeningShop
{
    public class KoszykRekord
    {
        public KoszykRekord(ShopItem item)
        {
            this.item = item;
            this.ilosc = 1;
        }

        public void SetIlosc(int newIlosc)
        {
            this.ilosc = newIlosc;
        }

        public int GetIlosc()
        {
            return ilosc;
        }

        public ShopItem GetItem()
        {
            return item;
        }

        private ShopItem item;
        private int ilosc;

    }
}
