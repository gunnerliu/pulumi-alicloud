// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/pvtz_zone.html.markdown.
type Zone struct {
	s *pulumi.ResourceState
}

// NewZone registers a new resource with the given unique name, arguments, and options.
func NewZone(ctx *pulumi.Context,
	name string, args *ZoneArgs, opts ...pulumi.ResourceOpt) (*Zone, error) {
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["lang"] = nil
		inputs["name"] = nil
		inputs["proxyPattern"] = nil
		inputs["remark"] = nil
		inputs["userClientIp"] = nil
	} else {
		inputs["lang"] = args.Lang
		inputs["name"] = args.Name
		inputs["proxyPattern"] = args.ProxyPattern
		inputs["remark"] = args.Remark
		inputs["userClientIp"] = args.UserClientIp
	}
	inputs["creationTime"] = nil
	inputs["isPtr"] = nil
	inputs["recordCount"] = nil
	inputs["updateTime"] = nil
	s, err := ctx.RegisterResource("alicloud:pvtz/zone:Zone", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Zone{s: s}, nil
}

// GetZone gets an existing Zone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZone(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ZoneState, opts ...pulumi.ResourceOpt) (*Zone, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["creationTime"] = state.CreationTime
		inputs["isPtr"] = state.IsPtr
		inputs["lang"] = state.Lang
		inputs["name"] = state.Name
		inputs["proxyPattern"] = state.ProxyPattern
		inputs["recordCount"] = state.RecordCount
		inputs["remark"] = state.Remark
		inputs["updateTime"] = state.UpdateTime
		inputs["userClientIp"] = state.UserClientIp
	}
	s, err := ctx.ReadResource("alicloud:pvtz/zone:Zone", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Zone{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Zone) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Zone) ID() pulumi.IDOutput {
	return r.s.ID()
}

func (r *Zone) CreationTime() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["creationTime"])
}

func (r *Zone) IsPtr() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["isPtr"])
}

// The language. Valid values: "zh", "en", "jp".
func (r *Zone) Lang() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["lang"])
}

// The name of the Private Zone.
func (r *Zone) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// The recursive DNS proxy. Valid values:
// - ZONE: indicates that the recursive DNS proxy is disabled.
// - RECORD: indicates that the recursive DNS proxy is enabled.
func (r *Zone) ProxyPattern() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["proxyPattern"])
}

// The count of the Private Zone Record.
func (r *Zone) RecordCount() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["recordCount"])
}

// The remark of the Private Zone.
func (r *Zone) Remark() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["remark"])
}

func (r *Zone) UpdateTime() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["updateTime"])
}

// The IP address of the client.
func (r *Zone) UserClientIp() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["userClientIp"])
}

// Input properties used for looking up and filtering Zone resources.
type ZoneState struct {
	CreationTime interface{}
	IsPtr interface{}
	// The language. Valid values: "zh", "en", "jp".
	Lang interface{}
	// The name of the Private Zone.
	Name interface{}
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	ProxyPattern interface{}
	// The count of the Private Zone Record.
	RecordCount interface{}
	// The remark of the Private Zone.
	Remark interface{}
	UpdateTime interface{}
	// The IP address of the client.
	UserClientIp interface{}
}

// The set of arguments for constructing a Zone resource.
type ZoneArgs struct {
	// The language. Valid values: "zh", "en", "jp".
	Lang interface{}
	// The name of the Private Zone.
	Name interface{}
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	ProxyPattern interface{}
	// The remark of the Private Zone.
	Remark interface{}
	// The IP address of the client.
	UserClientIp interface{}
}
