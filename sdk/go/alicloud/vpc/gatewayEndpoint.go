// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a VPC Gateway Endpoint resource. VPC gateway endpoint.
//
// For information about VPC Gateway Endpoint and how to use it, see [What is Gateway Endpoint](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/gateway-endpoint).
//
// > **NOTE:** Available since v1.208.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			domain := "com.aliyun.cn-hangzhou.oss"
//			if param := cfg.Get("domain"); param != "" {
//				domain = param
//			}
//			defaultVpc, err := vpc.NewNetwork(ctx, "defaultVpc", &vpc.NetworkArgs{
//				Description: pulumi.String("tf-example"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultRg, err := resourcemanager.NewResourceGroup(ctx, "defaultRg", &resourcemanager.ResourceGroupArgs{
//				DisplayName:       pulumi.String("tf-example-497"),
//				ResourceGroupName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewGatewayEndpoint(ctx, "default", &vpc.GatewayEndpointArgs{
//				GatewayEndpointDescrption: pulumi.String("test-gateway-endpoint"),
//				GatewayEndpointName:       pulumi.String(name),
//				VpcId:                     defaultVpc.ID(),
//				ResourceGroupId:           defaultRg.ID(),
//				ServiceName:               pulumi.String(domain),
//				PolicyDocument:            pulumi.String("{ \"Version\" : \"1\", \"Statement\" : [ { \"Effect\" : \"Allow\", \"Resource\" : [ \"*\" ], \"Action\" : [ \"*\" ], \"Principal\" : [ \"*\" ] } ] }"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// VPC Gateway Endpoint can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/gatewayEndpoint:GatewayEndpoint example <id>
//
// ```
type GatewayEndpoint struct {
	pulumi.CustomResourceState

	// The creation time of the gateway endpoint.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The description of the gateway endpoint.
	GatewayEndpointDescrption pulumi.StringPtrOutput `pulumi:"gatewayEndpointDescrption"`
	// The name of the gateway endpoint.
	GatewayEndpointName pulumi.StringPtrOutput `pulumi:"gatewayEndpointName"`
	// Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
	PolicyDocument pulumi.StringPtrOutput `pulumi:"policyDocument"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The name of endpoint service.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// The status of VPC gateway endpoint.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags of the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The ID of the VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewGatewayEndpoint registers a new resource with the given unique name, arguments, and options.
func NewGatewayEndpoint(ctx *pulumi.Context,
	name string, args *GatewayEndpointArgs, opts ...pulumi.ResourceOption) (*GatewayEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewayEndpoint
	err := ctx.RegisterResource("alicloud:vpc/gatewayEndpoint:GatewayEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayEndpoint gets an existing GatewayEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayEndpointState, opts ...pulumi.ResourceOption) (*GatewayEndpoint, error) {
	var resource GatewayEndpoint
	err := ctx.ReadResource("alicloud:vpc/gatewayEndpoint:GatewayEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayEndpoint resources.
type gatewayEndpointState struct {
	// The creation time of the gateway endpoint.
	CreateTime *string `pulumi:"createTime"`
	// The description of the gateway endpoint.
	GatewayEndpointDescrption *string `pulumi:"gatewayEndpointDescrption"`
	// The name of the gateway endpoint.
	GatewayEndpointName *string `pulumi:"gatewayEndpointName"`
	// Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
	PolicyDocument *string `pulumi:"policyDocument"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of endpoint service.
	ServiceName *string `pulumi:"serviceName"`
	// The status of VPC gateway endpoint.
	Status *string `pulumi:"status"`
	// The tags of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
}

type GatewayEndpointState struct {
	// The creation time of the gateway endpoint.
	CreateTime pulumi.StringPtrInput
	// The description of the gateway endpoint.
	GatewayEndpointDescrption pulumi.StringPtrInput
	// The name of the gateway endpoint.
	GatewayEndpointName pulumi.StringPtrInput
	// Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
	PolicyDocument pulumi.StringPtrInput
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The name of endpoint service.
	ServiceName pulumi.StringPtrInput
	// The status of VPC gateway endpoint.
	Status pulumi.StringPtrInput
	// The tags of the resource.
	Tags pulumi.MapInput
	// The ID of the VPC.
	VpcId pulumi.StringPtrInput
}

func (GatewayEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayEndpointState)(nil)).Elem()
}

type gatewayEndpointArgs struct {
	// The description of the gateway endpoint.
	GatewayEndpointDescrption *string `pulumi:"gatewayEndpointDescrption"`
	// The name of the gateway endpoint.
	GatewayEndpointName *string `pulumi:"gatewayEndpointName"`
	// Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
	PolicyDocument *string `pulumi:"policyDocument"`
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of endpoint service.
	ServiceName string `pulumi:"serviceName"`
	// The tags of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of the VPC.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a GatewayEndpoint resource.
type GatewayEndpointArgs struct {
	// The description of the gateway endpoint.
	GatewayEndpointDescrption pulumi.StringPtrInput
	// The name of the gateway endpoint.
	GatewayEndpointName pulumi.StringPtrInput
	// Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
	PolicyDocument pulumi.StringPtrInput
	// The ID of the resource group to which the instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The name of endpoint service.
	ServiceName pulumi.StringInput
	// The tags of the resource.
	Tags pulumi.MapInput
	// The ID of the VPC.
	VpcId pulumi.StringInput
}

func (GatewayEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayEndpointArgs)(nil)).Elem()
}

type GatewayEndpointInput interface {
	pulumi.Input

	ToGatewayEndpointOutput() GatewayEndpointOutput
	ToGatewayEndpointOutputWithContext(ctx context.Context) GatewayEndpointOutput
}

func (*GatewayEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayEndpoint)(nil)).Elem()
}

func (i *GatewayEndpoint) ToGatewayEndpointOutput() GatewayEndpointOutput {
	return i.ToGatewayEndpointOutputWithContext(context.Background())
}

func (i *GatewayEndpoint) ToGatewayEndpointOutputWithContext(ctx context.Context) GatewayEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayEndpointOutput)
}

func (i *GatewayEndpoint) ToOutput(ctx context.Context) pulumix.Output[*GatewayEndpoint] {
	return pulumix.Output[*GatewayEndpoint]{
		OutputState: i.ToGatewayEndpointOutputWithContext(ctx).OutputState,
	}
}

// GatewayEndpointArrayInput is an input type that accepts GatewayEndpointArray and GatewayEndpointArrayOutput values.
// You can construct a concrete instance of `GatewayEndpointArrayInput` via:
//
//	GatewayEndpointArray{ GatewayEndpointArgs{...} }
type GatewayEndpointArrayInput interface {
	pulumi.Input

	ToGatewayEndpointArrayOutput() GatewayEndpointArrayOutput
	ToGatewayEndpointArrayOutputWithContext(context.Context) GatewayEndpointArrayOutput
}

type GatewayEndpointArray []GatewayEndpointInput

func (GatewayEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayEndpoint)(nil)).Elem()
}

func (i GatewayEndpointArray) ToGatewayEndpointArrayOutput() GatewayEndpointArrayOutput {
	return i.ToGatewayEndpointArrayOutputWithContext(context.Background())
}

func (i GatewayEndpointArray) ToGatewayEndpointArrayOutputWithContext(ctx context.Context) GatewayEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayEndpointArrayOutput)
}

func (i GatewayEndpointArray) ToOutput(ctx context.Context) pulumix.Output[[]*GatewayEndpoint] {
	return pulumix.Output[[]*GatewayEndpoint]{
		OutputState: i.ToGatewayEndpointArrayOutputWithContext(ctx).OutputState,
	}
}

// GatewayEndpointMapInput is an input type that accepts GatewayEndpointMap and GatewayEndpointMapOutput values.
// You can construct a concrete instance of `GatewayEndpointMapInput` via:
//
//	GatewayEndpointMap{ "key": GatewayEndpointArgs{...} }
type GatewayEndpointMapInput interface {
	pulumi.Input

	ToGatewayEndpointMapOutput() GatewayEndpointMapOutput
	ToGatewayEndpointMapOutputWithContext(context.Context) GatewayEndpointMapOutput
}

type GatewayEndpointMap map[string]GatewayEndpointInput

func (GatewayEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayEndpoint)(nil)).Elem()
}

func (i GatewayEndpointMap) ToGatewayEndpointMapOutput() GatewayEndpointMapOutput {
	return i.ToGatewayEndpointMapOutputWithContext(context.Background())
}

func (i GatewayEndpointMap) ToGatewayEndpointMapOutputWithContext(ctx context.Context) GatewayEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayEndpointMapOutput)
}

func (i GatewayEndpointMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*GatewayEndpoint] {
	return pulumix.Output[map[string]*GatewayEndpoint]{
		OutputState: i.ToGatewayEndpointMapOutputWithContext(ctx).OutputState,
	}
}

type GatewayEndpointOutput struct{ *pulumi.OutputState }

func (GatewayEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayEndpoint)(nil)).Elem()
}

func (o GatewayEndpointOutput) ToGatewayEndpointOutput() GatewayEndpointOutput {
	return o
}

func (o GatewayEndpointOutput) ToGatewayEndpointOutputWithContext(ctx context.Context) GatewayEndpointOutput {
	return o
}

func (o GatewayEndpointOutput) ToOutput(ctx context.Context) pulumix.Output[*GatewayEndpoint] {
	return pulumix.Output[*GatewayEndpoint]{
		OutputState: o.OutputState,
	}
}

// The creation time of the gateway endpoint.
func (o GatewayEndpointOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The description of the gateway endpoint.
func (o GatewayEndpointOutput) GatewayEndpointDescrption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringPtrOutput { return v.GatewayEndpointDescrption }).(pulumi.StringPtrOutput)
}

// The name of the gateway endpoint.
func (o GatewayEndpointOutput) GatewayEndpointName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringPtrOutput { return v.GatewayEndpointName }).(pulumi.StringPtrOutput)
}

// Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
func (o GatewayEndpointOutput) PolicyDocument() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringPtrOutput { return v.PolicyDocument }).(pulumi.StringPtrOutput)
}

// The ID of the resource group to which the instance belongs.
func (o GatewayEndpointOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The name of endpoint service.
func (o GatewayEndpointOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// The status of VPC gateway endpoint.
func (o GatewayEndpointOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags of the resource.
func (o GatewayEndpointOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The ID of the VPC.
func (o GatewayEndpointOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpoint) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type GatewayEndpointArrayOutput struct{ *pulumi.OutputState }

func (GatewayEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayEndpoint)(nil)).Elem()
}

func (o GatewayEndpointArrayOutput) ToGatewayEndpointArrayOutput() GatewayEndpointArrayOutput {
	return o
}

func (o GatewayEndpointArrayOutput) ToGatewayEndpointArrayOutputWithContext(ctx context.Context) GatewayEndpointArrayOutput {
	return o
}

func (o GatewayEndpointArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*GatewayEndpoint] {
	return pulumix.Output[[]*GatewayEndpoint]{
		OutputState: o.OutputState,
	}
}

func (o GatewayEndpointArrayOutput) Index(i pulumi.IntInput) GatewayEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewayEndpoint {
		return vs[0].([]*GatewayEndpoint)[vs[1].(int)]
	}).(GatewayEndpointOutput)
}

type GatewayEndpointMapOutput struct{ *pulumi.OutputState }

func (GatewayEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayEndpoint)(nil)).Elem()
}

func (o GatewayEndpointMapOutput) ToGatewayEndpointMapOutput() GatewayEndpointMapOutput {
	return o
}

func (o GatewayEndpointMapOutput) ToGatewayEndpointMapOutputWithContext(ctx context.Context) GatewayEndpointMapOutput {
	return o
}

func (o GatewayEndpointMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*GatewayEndpoint] {
	return pulumix.Output[map[string]*GatewayEndpoint]{
		OutputState: o.OutputState,
	}
}

func (o GatewayEndpointMapOutput) MapIndex(k pulumi.StringInput) GatewayEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewayEndpoint {
		return vs[0].(map[string]*GatewayEndpoint)[vs[1].(string)]
	}).(GatewayEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayEndpointInput)(nil)).Elem(), &GatewayEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayEndpointArrayInput)(nil)).Elem(), GatewayEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayEndpointMapInput)(nil)).Elem(), GatewayEndpointMap{})
	pulumi.RegisterOutputType(GatewayEndpointOutput{})
	pulumi.RegisterOutputType(GatewayEndpointArrayOutput{})
	pulumi.RegisterOutputType(GatewayEndpointMapOutput{})
}
