using Fiap.Revisao2.Models;
using Fiap.Revisao2.Units;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Revisao2.Controllers
{
    public class AtletaController : Controller
    {
        private UnitOfWork _unit = new UnitOfWork();

        [HttpGet]
        public ActionResult Cadastrar()
        {
            var listaEsportes = _unit.EsporteRepository.Listar();
            ViewBag.lstEsportes = new SelectList(listaEsportes, "EsporteId", "Nome");
            return View();
        }

        [HttpPost]
        public ActionResult Cadastrar(Atleta atleta)
        {
            if (ModelState.IsValid)
            {
                _unit.AtletaRepository.Cadastrar(atleta);
                _unit.Salvar();

                TempData["msg"] = "Atleta cadastrado com sucesso.";
                return RedirectToAction("Cadastrar");
            }
            return View();
        }
        protected override void Dispose(bool disposing)
        {
            _unit.Dispose();
            base.Dispose(disposing);
        }
    }
}