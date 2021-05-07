using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace GardeningShop
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    public partial class MainWindow : NavigationWindow
    {
        private static StanKoszyka _stanKoszyka;
        public static StanKoszyka StanKoszyka { 
            get { if (_stanKoszyka == null) _stanKoszyka = new StanKoszyka(); return _stanKoszyka; } 
            set {_stanKoszyka = value;}
        }

        public MainWindow()
        {
            StanKoszyka = new StanKoszyka();
            
            InitializeComponent();
        }

    }
}
