// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/api_gateway_api.html.markdown.
type Api struct {
	s *pulumi.ResourceState
}

// NewApi registers a new resource with the given unique name, arguments, and options.
func NewApi(ctx *pulumi.Context,
	name string, args *ApiArgs, opts ...pulumi.ResourceOpt) (*Api, error) {
	if args == nil || args.AuthType == nil {
		return nil, errors.New("missing required argument 'AuthType'")
	}
	if args == nil || args.Description == nil {
		return nil, errors.New("missing required argument 'Description'")
	}
	if args == nil || args.GroupId == nil {
		return nil, errors.New("missing required argument 'GroupId'")
	}
	if args == nil || args.RequestConfig == nil {
		return nil, errors.New("missing required argument 'RequestConfig'")
	}
	if args == nil || args.ServiceType == nil {
		return nil, errors.New("missing required argument 'ServiceType'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["authType"] = nil
		inputs["constantParameters"] = nil
		inputs["description"] = nil
		inputs["fcServiceConfig"] = nil
		inputs["groupId"] = nil
		inputs["httpServiceConfig"] = nil
		inputs["httpVpcServiceConfig"] = nil
		inputs["mockServiceConfig"] = nil
		inputs["name"] = nil
		inputs["requestConfig"] = nil
		inputs["requestParameters"] = nil
		inputs["serviceType"] = nil
		inputs["stageNames"] = nil
		inputs["systemParameters"] = nil
	} else {
		inputs["authType"] = args.AuthType
		inputs["constantParameters"] = args.ConstantParameters
		inputs["description"] = args.Description
		inputs["fcServiceConfig"] = args.FcServiceConfig
		inputs["groupId"] = args.GroupId
		inputs["httpServiceConfig"] = args.HttpServiceConfig
		inputs["httpVpcServiceConfig"] = args.HttpVpcServiceConfig
		inputs["mockServiceConfig"] = args.MockServiceConfig
		inputs["name"] = args.Name
		inputs["requestConfig"] = args.RequestConfig
		inputs["requestParameters"] = args.RequestParameters
		inputs["serviceType"] = args.ServiceType
		inputs["stageNames"] = args.StageNames
		inputs["systemParameters"] = args.SystemParameters
	}
	inputs["apiId"] = nil
	s, err := ctx.RegisterResource("alicloud:apigateway/api:Api", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Api{s: s}, nil
}

// GetApi gets an existing Api resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApi(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ApiState, opts ...pulumi.ResourceOpt) (*Api, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["apiId"] = state.ApiId
		inputs["authType"] = state.AuthType
		inputs["constantParameters"] = state.ConstantParameters
		inputs["description"] = state.Description
		inputs["fcServiceConfig"] = state.FcServiceConfig
		inputs["groupId"] = state.GroupId
		inputs["httpServiceConfig"] = state.HttpServiceConfig
		inputs["httpVpcServiceConfig"] = state.HttpVpcServiceConfig
		inputs["mockServiceConfig"] = state.MockServiceConfig
		inputs["name"] = state.Name
		inputs["requestConfig"] = state.RequestConfig
		inputs["requestParameters"] = state.RequestParameters
		inputs["serviceType"] = state.ServiceType
		inputs["stageNames"] = state.StageNames
		inputs["systemParameters"] = state.SystemParameters
	}
	s, err := ctx.ReadResource("alicloud:apigateway/api:Api", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Api{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Api) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Api) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The ID of the api of api gateway.
func (r *Api) ApiId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["apiId"])
}

// The authorization Type including APP and ANONYMOUS. Defaults to null.
func (r *Api) AuthType() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["authType"])
}

// constant_parameters defines the constant parameters of the api.
func (r *Api) ConstantParameters() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["constantParameters"])
}

// The description of Constant parameter.
func (r *Api) Description() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["description"])
}

// fc_service_config defines the config when serviceType selected 'FunctionCompute'.
func (r *Api) FcServiceConfig() pulumi.Output {
	return r.s.State["fcServiceConfig"]
}

// The api gateway that the api belongs to. Defaults to null.
func (r *Api) GroupId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["groupId"])
}

// http_service_config defines the config when serviceType selected 'HTTP'.
func (r *Api) HttpServiceConfig() pulumi.Output {
	return r.s.State["httpServiceConfig"]
}

// http_vpc_service_config defines the config when serviceType selected 'HTTP-VPC'.
func (r *Api) HttpVpcServiceConfig() pulumi.Output {
	return r.s.State["httpVpcServiceConfig"]
}

// http_service_config defines the config when serviceType selected 'MOCK'.
func (r *Api) MockServiceConfig() pulumi.Output {
	return r.s.State["mockServiceConfig"]
}

// System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
func (r *Api) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// Request_config defines how users can send requests to your API.
func (r *Api) RequestConfig() pulumi.Output {
	return r.s.State["requestConfig"]
}

// request_parameters defines the request parameters of the api.
func (r *Api) RequestParameters() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["requestParameters"])
}

// The type of backend service. Type including HTTP,VPC and MOCK. Defaults to null.
func (r *Api) ServiceType() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["serviceType"])
}

// Stages that the api need to be deployed. Valid value: RELEASE | PRE | TEST.
func (r *Api) StageNames() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["stageNames"])
}

// system_parameters defines the system parameters of the api.
func (r *Api) SystemParameters() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["systemParameters"])
}

// Input properties used for looking up and filtering Api resources.
type ApiState struct {
	// The ID of the api of api gateway.
	ApiId interface{}
	// The authorization Type including APP and ANONYMOUS. Defaults to null.
	AuthType interface{}
	// constant_parameters defines the constant parameters of the api.
	ConstantParameters interface{}
	// The description of Constant parameter.
	Description interface{}
	// fc_service_config defines the config when serviceType selected 'FunctionCompute'.
	FcServiceConfig interface{}
	// The api gateway that the api belongs to. Defaults to null.
	GroupId interface{}
	// http_service_config defines the config when serviceType selected 'HTTP'.
	HttpServiceConfig interface{}
	// http_vpc_service_config defines the config when serviceType selected 'HTTP-VPC'.
	HttpVpcServiceConfig interface{}
	// http_service_config defines the config when serviceType selected 'MOCK'.
	MockServiceConfig interface{}
	// System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
	Name interface{}
	// Request_config defines how users can send requests to your API.
	RequestConfig interface{}
	// request_parameters defines the request parameters of the api.
	RequestParameters interface{}
	// The type of backend service. Type including HTTP,VPC and MOCK. Defaults to null.
	ServiceType interface{}
	// Stages that the api need to be deployed. Valid value: RELEASE | PRE | TEST.
	StageNames interface{}
	// system_parameters defines the system parameters of the api.
	SystemParameters interface{}
}

// The set of arguments for constructing a Api resource.
type ApiArgs struct {
	// The authorization Type including APP and ANONYMOUS. Defaults to null.
	AuthType interface{}
	// constant_parameters defines the constant parameters of the api.
	ConstantParameters interface{}
	// The description of Constant parameter.
	Description interface{}
	// fc_service_config defines the config when serviceType selected 'FunctionCompute'.
	FcServiceConfig interface{}
	// The api gateway that the api belongs to. Defaults to null.
	GroupId interface{}
	// http_service_config defines the config when serviceType selected 'HTTP'.
	HttpServiceConfig interface{}
	// http_vpc_service_config defines the config when serviceType selected 'HTTP-VPC'.
	HttpVpcServiceConfig interface{}
	// http_service_config defines the config when serviceType selected 'MOCK'.
	MockServiceConfig interface{}
	// System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
	Name interface{}
	// Request_config defines how users can send requests to your API.
	RequestConfig interface{}
	// request_parameters defines the request parameters of the api.
	RequestParameters interface{}
	// The type of backend service. Type including HTTP,VPC and MOCK. Defaults to null.
	ServiceType interface{}
	// Stages that the api need to be deployed. Valid value: RELEASE | PRE | TEST.
	StageNames interface{}
	// system_parameters defines the system parameters of the api.
	SystemParameters interface{}
}