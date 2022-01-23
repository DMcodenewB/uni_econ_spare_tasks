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
            this.Itemname = item.item_name;
            this.Ilosc = 1;
            this.Cena_zwyk = item.price;
            this.Cena_sum = item.price * Ilosc;
        }

        public KoszykRekord(string itemname, string ilosc, string cena)
        {
            this.Itemname = itemname;
            this.Ilosc = Int32.Parse(ilosc);
            this.Cena_sum = float.Parse(cena);
        }

        public void SetIlosc(int newIlosc)
        {
            this.Ilosc = newIlosc;
            this.Cena_sum = Cena_zwyk * Ilosc;
        }

        public int GetIlosc()
        {
            return Ilosc;
        }

        public string Itemname { get; set; }
        public int Ilosc { get; set; }
        public float Cena_zwyk { get; set; }
        public float Cena_sum { get; set; }

    }
}
