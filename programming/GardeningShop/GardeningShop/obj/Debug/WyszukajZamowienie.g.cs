﻿#pragma checksum "..\..\WyszukajZamowienie.xaml" "{8829d00f-11b8-4213-878b-770e8597ac16}" "61779090FB72D6A040D16E7173F3CD25C79C6D3F8A3C3E37BEC2D8CB45BF6935"
//------------------------------------------------------------------------------
// <auto-generated>
//     Ten kod został wygenerowany przez narzędzie.
//     Wersja wykonawcza:4.0.30319.42000
//
//     Zmiany w tym pliku mogą spowodować nieprawidłowe zachowanie i zostaną utracone, jeśli
//     kod zostanie ponownie wygenerowany.
// </auto-generated>
//------------------------------------------------------------------------------

using GardeningShop;
using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace GardeningShop {
    
    
    /// <summary>
    /// WyszukajZamowienie
    /// </summary>
    public partial class WyszukajZamowienie : System.Windows.Controls.Page, System.Windows.Markup.IComponentConnector {
        
        
        #line 164 "..\..\WyszukajZamowienie.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox NrZamowieniaBox;
        
        #line default
        #line hidden
        
        
        #line 166 "..\..\WyszukajZamowienie.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBlock NrZamText;
        
        #line default
        #line hidden
        
        
        #line 179 "..\..\WyszukajZamowienie.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button SzukajBtn;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/GardeningShop;component/wyszukajzamowienie.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\WyszukajZamowienie.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            
            #line 34 "..\..\WyszukajZamowienie.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.LogoBtnClick);
            
            #line default
            #line hidden
            return;
            case 2:
            
            #line 65 "..\..\WyszukajZamowienie.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.HomepageBtnClick);
            
            #line default
            #line hidden
            return;
            case 3:
            
            #line 81 "..\..\WyszukajZamowienie.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.SklepBtnClick);
            
            #line default
            #line hidden
            return;
            case 4:
            
            #line 97 "..\..\WyszukajZamowienie.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.KontaktBtnClick);
            
            #line default
            #line hidden
            return;
            case 5:
            
            #line 113 "..\..\WyszukajZamowienie.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.KoszykBtnClick);
            
            #line default
            #line hidden
            return;
            case 6:
            this.NrZamowieniaBox = ((System.Windows.Controls.TextBox)(target));
            return;
            case 7:
            this.NrZamText = ((System.Windows.Controls.TextBlock)(target));
            return;
            case 8:
            this.SzukajBtn = ((System.Windows.Controls.Button)(target));
            
            #line 186 "..\..\WyszukajZamowienie.xaml"
            this.SzukajBtn.Click += new System.Windows.RoutedEventHandler(this.SzukajBtnClick);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

