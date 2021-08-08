package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ACajas;
import com.example.demo.model.ALicor;
import com.example.demo.model.AMermeladas;
import com.example.demo.model.ASalsas;
import com.example.demo.model.PCajas;
import com.example.demo.model.PLicor;
import com.example.demo.model.PMermelada;
import com.example.demo.model.Pedidos;
import com.example.demo.model.SalsasP;
import com.example.demo.repository.*;


import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping


public class ClaseController {
	@Autowired
	private ISalsasPService irs;
	@Autowired
	private IPMermeladaService ims;
	@Autowired
	private IPCajasService ics;
	@Autowired
	private IPLicorService ils;
	@Autowired
	private IAMermeladasService iams;
	@Autowired
	private IASalsasService ias;
	@Autowired
	private IACajasService ici;
	@Autowired
	private IALicorService lcs;
	@Autowired
	private IPedidosService pedi;
	
	@GetMapping("/index")
	public String index(Model model, @AuthenticationPrincipal User user)
	{
		String name=user.getUsername();
	   model.addAttribute("name", name);
		return "index";
	}
	@GetMapping("/Precios")
	public String Precios(Model model, @AuthenticationPrincipal User user)
	{
				return "Precios";
	}
	
	//Crud precio Salsas-------------------------------------------------------------
	@GetMapping("/gestionPrecios")
	public String greeting(Model model) {
		List<SalsasP> salp=irs.listar();
		model.addAttribute("presal", salp);
		return "gestionPrecios";
	}
	
	
	@GetMapping("/nuevoPrecio")
	public String nuevoPrecio(Model model) {
		model.addAttribute("presal",new SalsasP());
		return "AltaPrecio";
	}
	
	@PostMapping("/guardarPrecio/")
	public String guardarPrecio(@Validated SalsasP r,Errors e, Model model) {
		if(e.hasErrors()) {
			return "AltaPrecio";
		}else {
		irs.save(r);
	}
		return "redirect:/gestionPrecios";
	}
	
	@GetMapping("/editarPrecio/{idPS}")
	public String editarPrecio(@PathVariable int idPS, Model model) {
		Optional<SalsasP> salp=irs.listarId(idPS);
		model.addAttribute("presal",salp);
		return "AltaPrecio";
	}
	
	@GetMapping("/eliminarPrecio/{idPS}")
	public String eliminarPrecio(@PathVariable int idPS,Model model) {
		irs.delete(idPS);
		return "redirect:/gestionPrecios";
	}
	//Crud precio Mermelada-------------------------------------------------------------
	@GetMapping("/gestionPMermelada")
	public String gestionPMermelada(Model model) {
		List<PMermelada> mermelada=ims.listar();
		model.addAttribute("mermeladas", mermelada);
		return "gestionPMermelada";
	}
	
	@GetMapping("/nuevoPMermelada")
	public String nuevoPMermelada(Model model) {
		model.addAttribute("mermeladas",new PMermelada());
		return "AltaPMermelada";
	}
	
	@PostMapping("/guardarPMermelada")
	public String guardarPMermelada(@Validated PMermelada pm,Errors e, Model model) {
		if(e.hasErrors()) {
			return "AltaPMermelada";
		}
		else {
		ims.save(pm);
			}
		return "redirect:/gestionPMermelada";
	}
	@GetMapping("/editarPMermelada/{id_PM}")
	public String editarPMermelada(@PathVariable int id_PM,Model model) {
		Optional<PMermelada> mermelada=ims.listarId(id_PM);
		model.addAttribute("mermeladas",mermelada);
		return "AltaPMermelada";
	}
	
	@GetMapping("/eliminarPMermelada/{id_PM}")
	public String eliminarPMermelada(@PathVariable int id_PM,Model model) {
		ims.delete(id_PM);
		return "redirect:/gestionPMermelada";
	}
	
	//Crud precio Cajas------------------------------------------------------------------------------------------------
		@GetMapping("/gestionPCajas")
		public String gestionPCajas(Model model) {
			List<PCajas> cajas=ics.listar();
			model.addAttribute("preca", cajas);
			return "gestionPCajas";
		}
		
		@GetMapping("/nuevoPCajas")
		public String nuevoPCajas(Model model) {
			model.addAttribute("preca",new PCajas());
			return "AltaPCajas";
		}
		
		@PostMapping("/guardarPCajas")
		public String guardarPCajas(@Validated PCajas pc,Errors e, Model model) {
			if(e.hasErrors()) {
				return "AltaPCajas";
			}
			else {
			ics.save(pc);
				}
			return "redirect:/gestionPCajas";
		}
		@GetMapping("/editarPCajas/{id_PC}")
		public String editarPCajas(@PathVariable int id_PC,Model model) {
			Optional<PCajas> cajas=ics.listarId(id_PC);
			model.addAttribute("preca",cajas);
			return "AltaPCajas";
		}
		
		@GetMapping("/eliminarPCajas/{id_PC}")
		public String eliminarPCajas(@PathVariable int id_PC,Model model) {
			ics.delete(id_PC);
			return "redirect:/gestionPCajas";
		}
		
		//Crud precio Licor-------------------------------------------------------------
		@GetMapping("/gestionPLicor")
		public String gestionPLicor(Model model) {
			List<PLicor> licor=ils.listar();
			model.addAttribute("licors", licor);
			return "gestionPLicor";
		}
		@GetMapping("/nuevoPLicor")
		public String nuevoPLicor(Model model) {
			model.addAttribute("licors",new PLicor());
			return "AltaPLicor";
		}
		
		@PostMapping("/guardarPLicor")
		public String guardarPLicor(@Validated PLicor pl,Errors e, Model model) {
			if(e.hasErrors()) {
				return "AltaPLicor";
			}
			else {
			ils.save(pl);
				}
			return "redirect:/gestionPLicor";
	}
		@GetMapping("/editarPLicor/{id_PL}")
		public String editarPLicor(@PathVariable int id_PL,Model model) {
			Optional<PLicor> licor=ils.listarId(id_PL);
			model.addAttribute("licors",licor);
			return "AltaPLicor";
		}
		
		@GetMapping("/eliminarPLicor/{id_PL}")
		public String eliminarPLicor(@PathVariable int id_PL,Model model) {
			ils.delete(id_PL);
			return "redirect:/gestionPLicor";
		}
		//Crud Mermeladas en Almacen-------------------------------------------------------------
				@GetMapping("/inventarioMermeladas")
				public String inventarioMermeladas(Model model) {
					List<AMermeladas> AMermelada=iams.listar();
					model.addAttribute("ame", AMermelada);
					return "inventarioMermeladas";
				}
				@GetMapping("/nuevoIMermeladas")
				public String nuevoIMermeladas(Model model) {
					model.addAttribute("ame",new AMermeladas());
					return "AltaIMermeladas";
				}
				
				@PostMapping("/guardarnuevoIMermeladas")
				public String guardarnuevoIMermeladas(@Validated AMermeladas im,Errors e, Model model) {
					if(e.hasErrors()) {
						return "AltaIMermeladas";
					}
					else {
					iams.save(im);
						}
					return "redirect:/inventarioMermeladas";
			}
				@GetMapping("/editarIMermeladas/{id_RM}")
				public String editarIMermeladas(@PathVariable int id_RM,Model model) {
					Optional<AMermeladas> AMermelada=iams.listarId(id_RM);
					model.addAttribute("ame", AMermelada);
					return "AltaIMermeladas";
				}
				
				@GetMapping("/eliminarIMermeladas/{id_RM}")
				public String eliminarIMermeladas(@PathVariable int id_RM, Model model) {
					iams.delete(id_RM);
					return "redirect:/inventarioMermeladas";
				}
				//Crud Salsas en Almacen-------------------------------------------------------------
				@GetMapping("/inventarioSalsas")
				public String inventarioSalsas(Model model) {
					List<ASalsas> ASalsa=ias.listar();
					model.addAttribute("ls", ASalsa);
					return "inventarioSalsas";
				}
				@GetMapping("/nuevoISalsas")
				public String nuevoISalsas(Model model) {
					model.addAttribute("ls",new ASalsas());
					return "AltaISalsas";
				}
				
				@PostMapping("/guardarnuevoISalsas")
				public String guardarnuevoISalsas(@Validated ASalsas is,Errors e, Model model) {
					if(e.hasErrors()) {
						return "AltaISalsas";
					}
					else {
					ias.save(is);
						}
					return "redirect:/inventarioSalsas";
			}
				@GetMapping("/editarISalsas/{id_RS}")
				public String editarISalsas(@PathVariable int id_RS,Model model) {
					Optional<ASalsas> ASalsa=ias.listarId(id_RS);
					model.addAttribute("ls", ASalsa);
					return "AltaISalsas";
				}
				
				@GetMapping("/eliminarISalsas/{id_RS}")
				public String eliminarISalsas(@PathVariable int id_RS,Model model) {
					ias.delete(id_RS);
					return "redirect:/inventarioSalsas";
			}
				//Crud Cajas en Almacen-------------------------------------------------------------
				@GetMapping("/inventarioCajas")
				public String inventarioCajas(Model model) {
					List<ACajas> ACaja=ici.listar();
					model.addAttribute("cjs", ACaja);
					return "inventarioCajas";
				}
				@GetMapping("/nuevoICajas")
				public String nuevoICajas(Model model) {
					model.addAttribute("cjs",new ACajas());
					return "AltaICajas";
				}
				
				@PostMapping("/guardarnuevoICajas")
				public String guardarnuevoICajas(@Validated ACajas cas,Errors e, Model model) {
					if(e.hasErrors()) {
						return "AltaICajas";
					}
					else {
					ici.save(cas);
						}
					return "redirect:/inventarioCajas";
			}
				@GetMapping("/editarICajas/{id_RC}")
				public String editarICajas(@PathVariable int id_RC,Model model) {
					Optional<ACajas> ACaja=ici.listarId(id_RC);
					model.addAttribute("cjs", ACaja);
					return "AltaICajas";
				}
				
				@GetMapping("/eliminarICajas/{id_RC}")
				public String eliminarICajas(@PathVariable int id_RC,Model model) {
					ici.delete(id_RC);
					return "redirect:/inventarioCajas";
				}
				//Crud Licor en Almacen-------------------------------------------------------------
				@GetMapping("/inventarioLicor")
				public String inventarioLicor(Model model) {
					List<ALicor> ALicors=lcs.listar();
					model.addAttribute("lco", ALicors);
					return "inventarioLicor";
				}
				@GetMapping("/nuevoILicor")
				public String nuevoILicor(Model model) {
					model.addAttribute("lco",new ALicor());
					return "AltaILicor";
				}
				
				@PostMapping("/guardarnuevoILicor")
				public String guardarnuevoILicor(@Validated ALicor lcr,Errors e, Model model) {
					if(e.hasErrors()) {
						return "AltaILicor";
					}
					else {
					lcs.save(lcr);
						}
					return "redirect:/inventarioLicor";
			}
				@GetMapping("/editarILicor/{id_RL}")
				public String editarILicor(@PathVariable int id_RL,Model model) {
					Optional<ALicor> ALicors=lcs.listarId(id_RL);
					model.addAttribute("lco", ALicors);
					return "AltaIColor";
				}
				
				@GetMapping("/eliminarILicor/{id_RL}")
				public String eliminarILicor(@PathVariable int id_RL,Model model) {
					lcs.delete(id_RL);
					return "redirect:/inventarioLicor";
				}
				//Crud Pedidos-------------------------------------------------------------
				@GetMapping("/registroPedidos")
				public String registroPedidos(Model model) {
					List<Pedidos> Pedido=pedi.listar();
					model.addAttribute("peds", Pedido);
					return "registroPedidos";
				}
				@GetMapping("/nuevoPedidos")
				public String nuevoPedidos(Model model) {
					model.addAttribute("peds",new Pedidos());
					return "AltaPedidos";
				}
				
				@PostMapping("/guardarnuevoPedidos")
				public String guardarnuevoPedidos(@Validated Pedidos rp,Errors e, Model model) {
					if(e.hasErrors()) {
						return "AltaPedidos";
					}
					else {
					pedi.save(rp);
						}
					return "redirect:/registroPedidos";
			}
				@GetMapping("/editarPedidos/{id_Pedido}")
				public String editarPedidos(@PathVariable int id_Pedido,Model model) {
					Optional<Pedidos> Pedido=pedi.listarId(id_Pedido);
					model.addAttribute("peds", Pedido);
					return "AltaPedidos";
				}
				
				@GetMapping("/eliminarPedidos/{id_Pedido}")
				public String eliminarPedidos(@PathVariable int id_Pedido,Model model) {
					pedi.delete(id_Pedido);
					return "redirect:/registroPedidos";
				}
			
}