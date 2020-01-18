// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/logtail_config.html.markdown.
type LogTailConfig struct {
	s *pulumi.ResourceState
}

// NewLogTailConfig registers a new resource with the given unique name, arguments, and options.
func NewLogTailConfig(ctx *pulumi.Context,
	name string, args *LogTailConfigArgs, opts ...pulumi.ResourceOpt) (*LogTailConfig, error) {
	if args == nil || args.InputDetail == nil {
		return nil, errors.New("missing required argument 'InputDetail'")
	}
	if args == nil || args.InputType == nil {
		return nil, errors.New("missing required argument 'InputType'")
	}
	if args == nil || args.Logstore == nil {
		return nil, errors.New("missing required argument 'Logstore'")
	}
	if args == nil || args.OutputType == nil {
		return nil, errors.New("missing required argument 'OutputType'")
	}
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["inputDetail"] = nil
		inputs["inputType"] = nil
		inputs["logSample"] = nil
		inputs["logstore"] = nil
		inputs["name"] = nil
		inputs["outputType"] = nil
		inputs["project"] = nil
	} else {
		inputs["inputDetail"] = args.InputDetail
		inputs["inputType"] = args.InputType
		inputs["logSample"] = args.LogSample
		inputs["logstore"] = args.Logstore
		inputs["name"] = args.Name
		inputs["outputType"] = args.OutputType
		inputs["project"] = args.Project
	}
	s, err := ctx.RegisterResource("alicloud:log/logTailConfig:LogTailConfig", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LogTailConfig{s: s}, nil
}

// GetLogTailConfig gets an existing LogTailConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogTailConfig(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LogTailConfigState, opts ...pulumi.ResourceOpt) (*LogTailConfig, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["inputDetail"] = state.InputDetail
		inputs["inputType"] = state.InputType
		inputs["logSample"] = state.LogSample
		inputs["logstore"] = state.Logstore
		inputs["name"] = state.Name
		inputs["outputType"] = state.OutputType
		inputs["project"] = state.Project
	}
	s, err := ctx.ReadResource("alicloud:log/logTailConfig:LogTailConfig", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LogTailConfig{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *LogTailConfig) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *LogTailConfig) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
func (r *LogTailConfig) InputDetail() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["inputDetail"])
}

// The input type. Currently only two types of files and plugin are supported.
func (r *LogTailConfig) InputType() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["inputType"])
}

// （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
func (r *LogTailConfig) LogSample() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["logSample"])
}

// The log store name to the query index belongs.
func (r *LogTailConfig) Logstore() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["logstore"])
}

// The Logtail configuration name, which is unique in the same project.
func (r *LogTailConfig) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// The output type. Currently, only LogService is supported.
func (r *LogTailConfig) OutputType() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["outputType"])
}

// The project name to the log store belongs.
func (r *LogTailConfig) Project() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["project"])
}

// Input properties used for looking up and filtering LogTailConfig resources.
type LogTailConfigState struct {
	// The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
	InputDetail interface{}
	// The input type. Currently only two types of files and plugin are supported.
	InputType interface{}
	// （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
	LogSample interface{}
	// The log store name to the query index belongs.
	Logstore interface{}
	// The Logtail configuration name, which is unique in the same project.
	Name interface{}
	// The output type. Currently, only LogService is supported.
	OutputType interface{}
	// The project name to the log store belongs.
	Project interface{}
}

// The set of arguments for constructing a LogTailConfig resource.
type LogTailConfigArgs struct {
	// The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
	InputDetail interface{}
	// The input type. Currently only two types of files and plugin are supported.
	InputType interface{}
	// （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
	LogSample interface{}
	// The log store name to the query index belongs.
	Logstore interface{}
	// The Logtail configuration name, which is unique in the same project.
	Name interface{}
	// The output type. Currently, only LogService is supported.
	OutputType interface{}
	// The project name to the log store belongs.
	Project interface{}
}
