// license:BSD-3-Clause
// copyright-holders:Curt Coder
/**********************************************************************

    ColecoVision Super Action Controller emulation

    Copyright MESS Team.
    Visit http://mamedev.org for licensing and usage restrictions.

**********************************************************************/

#pragma once

#ifndef __COLECO_SUPER_ACTION_CONTROLLER__
#define __COLECO_SUPER_ACTION_CONTROLLER__

#include "emu.h"
#include "ctrl.h"



//**************************************************************************
//  TYPE DEFINITIONS
//**************************************************************************

// ======================> coleco_super_action_controller_t

class coleco_super_action_controller_t : public device_t,
											public device_colecovision_control_port_interface
{
public:
	// construction/destruction
	coleco_super_action_controller_t(const machine_config &mconfig, const char *tag, device_t *owner, UINT32 clock);

	// optional information overrides
	virtual ioport_constructor device_input_ports() const;

	DECLARE_CUSTOM_INPUT_MEMBER( keypad_r );
	DECLARE_INPUT_CHANGED_MEMBER( slider_w );

protected:
	// device-level overrides
	virtual void device_start();

	// device_vcs_control_port_interface overrides
	virtual UINT8 joy_r();

private:
	required_ioport m_io_common0;
	required_ioport m_io_common1;
	required_ioport m_io_keypad;
};


// device type definition
extern const device_type COLECO_SUPER_ACTION_CONTROLLER;


#endif
