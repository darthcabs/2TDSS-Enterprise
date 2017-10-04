using Fiap.Revisao2.Models;
using Fiap.Revisao2.Units;
using System.Web.Mvc;

namespace Fiap.Revisao2.Controllers
{
    public class EsporteController : Controller
    {
        private UnitOfWork _unit = new UnitOfWork();

        [HttpGet]
        public ActionResult Cadastrar()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Cadastrar(Esporte esporte)
        {
            if (ModelState.IsValid)
            {
                _unit.EsporteRepository.Cadastrar(esporte);
                _unit.Salvar();

                TempData["msg"] = "Esporte cadastrado com sucesso.";
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