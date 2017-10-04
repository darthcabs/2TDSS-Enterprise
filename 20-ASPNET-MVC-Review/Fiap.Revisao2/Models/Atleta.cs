using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Fiap.Revisao2.Models
{
    public class Atleta
    {
        public int AtletaId { get; set; }
        public string Nome { get; set; }

        public Esporte Esporte { get; set; }

        public int EsporteId { get; set; }
    }
}