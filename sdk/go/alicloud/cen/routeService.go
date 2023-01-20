// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CEN Route Service resource. The virtual border routers (VBRs) and Cloud Connect Network (CCN) instances attached to Cloud Enterprise Network (CEN) instances can access the cloud services deployed in VPCs through the CEN instances.
//
// For information about CEN Route Service and how to use it, see [What is Route Service](https://www.alibabacloud.com/help/en/doc-detail/106671.htm).
//
// > **NOTE:** Available in v1.99.0+.
//
// > **NOTE:** Ensure that at least one VPC in the selected region is attached to the CEN instance.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-test"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			exampleNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
//				IsDefault: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := cen.NewInstance(ctx, "exampleInstance", nil)
//			if err != nil {
//				return err
//			}
//			vpc, err := cen.NewInstanceAttachment(ctx, "vpc", &cen.InstanceAttachmentArgs{
//				InstanceId:            exampleInstance.ID(),
//				ChildInstanceId:       *pulumi.String(exampleNetworks.Vpcs[0].Id),
//				ChildInstanceType:     pulumi.String("VPC"),
//				ChildInstanceRegionId: *pulumi.String(exampleNetworks.Vpcs[0].RegionId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cen.NewRouteService(ctx, "this", &cen.RouteServiceArgs{
//				AccessRegionId: *pulumi.String(exampleNetworks.Vpcs[0].RegionId),
//				HostRegionId:   *pulumi.String(exampleNetworks.Vpcs[0].RegionId),
//				HostVpcId:      *pulumi.String(exampleNetworks.Vpcs[0].Id),
//				CenId:          vpc.InstanceId,
//				Host:           pulumi.String("100.118.28.52/32"),
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
// CEN Route Service can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/routeService:RouteService example cen-ahixm0efqh********:cn-shanghai:100.118.28.52/32:cn-shanghai
//
// ```
type RouteService struct {
	pulumi.CustomResourceState

	// The region of the network instances that access the cloud services.
	AccessRegionId pulumi.StringOutput `pulumi:"accessRegionId"`
	// The ID of the CEN instance.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The description of the cloud service.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The domain name or IP address of the cloud service.
	Host pulumi.StringOutput `pulumi:"host"`
	// The region of the cloud service.
	HostRegionId pulumi.StringOutput `pulumi:"hostRegionId"`
	// The VPC associated with the cloud service.
	HostVpcId pulumi.StringOutput `pulumi:"hostVpcId"`
	// The status of the cloud service.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewRouteService registers a new resource with the given unique name, arguments, and options.
func NewRouteService(ctx *pulumi.Context,
	name string, args *RouteServiceArgs, opts ...pulumi.ResourceOption) (*RouteService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessRegionId == nil {
		return nil, errors.New("invalid value for required argument 'AccessRegionId'")
	}
	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.HostRegionId == nil {
		return nil, errors.New("invalid value for required argument 'HostRegionId'")
	}
	if args.HostVpcId == nil {
		return nil, errors.New("invalid value for required argument 'HostVpcId'")
	}
	var resource RouteService
	err := ctx.RegisterResource("alicloud:cen/routeService:RouteService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteService gets an existing RouteService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteServiceState, opts ...pulumi.ResourceOption) (*RouteService, error) {
	var resource RouteService
	err := ctx.ReadResource("alicloud:cen/routeService:RouteService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteService resources.
type routeServiceState struct {
	// The region of the network instances that access the cloud services.
	AccessRegionId *string `pulumi:"accessRegionId"`
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// The description of the cloud service.
	Description *string `pulumi:"description"`
	// The domain name or IP address of the cloud service.
	Host *string `pulumi:"host"`
	// The region of the cloud service.
	HostRegionId *string `pulumi:"hostRegionId"`
	// The VPC associated with the cloud service.
	HostVpcId *string `pulumi:"hostVpcId"`
	// The status of the cloud service.
	Status *string `pulumi:"status"`
}

type RouteServiceState struct {
	// The region of the network instances that access the cloud services.
	AccessRegionId pulumi.StringPtrInput
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput
	// The description of the cloud service.
	Description pulumi.StringPtrInput
	// The domain name or IP address of the cloud service.
	Host pulumi.StringPtrInput
	// The region of the cloud service.
	HostRegionId pulumi.StringPtrInput
	// The VPC associated with the cloud service.
	HostVpcId pulumi.StringPtrInput
	// The status of the cloud service.
	Status pulumi.StringPtrInput
}

func (RouteServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeServiceState)(nil)).Elem()
}

type routeServiceArgs struct {
	// The region of the network instances that access the cloud services.
	AccessRegionId string `pulumi:"accessRegionId"`
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The description of the cloud service.
	Description *string `pulumi:"description"`
	// The domain name or IP address of the cloud service.
	Host string `pulumi:"host"`
	// The region of the cloud service.
	HostRegionId string `pulumi:"hostRegionId"`
	// The VPC associated with the cloud service.
	HostVpcId string `pulumi:"hostVpcId"`
}

// The set of arguments for constructing a RouteService resource.
type RouteServiceArgs struct {
	// The region of the network instances that access the cloud services.
	AccessRegionId pulumi.StringInput
	// The ID of the CEN instance.
	CenId pulumi.StringInput
	// The description of the cloud service.
	Description pulumi.StringPtrInput
	// The domain name or IP address of the cloud service.
	Host pulumi.StringInput
	// The region of the cloud service.
	HostRegionId pulumi.StringInput
	// The VPC associated with the cloud service.
	HostVpcId pulumi.StringInput
}

func (RouteServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeServiceArgs)(nil)).Elem()
}

type RouteServiceInput interface {
	pulumi.Input

	ToRouteServiceOutput() RouteServiceOutput
	ToRouteServiceOutputWithContext(ctx context.Context) RouteServiceOutput
}

func (*RouteService) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteService)(nil)).Elem()
}

func (i *RouteService) ToRouteServiceOutput() RouteServiceOutput {
	return i.ToRouteServiceOutputWithContext(context.Background())
}

func (i *RouteService) ToRouteServiceOutputWithContext(ctx context.Context) RouteServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteServiceOutput)
}

// RouteServiceArrayInput is an input type that accepts RouteServiceArray and RouteServiceArrayOutput values.
// You can construct a concrete instance of `RouteServiceArrayInput` via:
//
//	RouteServiceArray{ RouteServiceArgs{...} }
type RouteServiceArrayInput interface {
	pulumi.Input

	ToRouteServiceArrayOutput() RouteServiceArrayOutput
	ToRouteServiceArrayOutputWithContext(context.Context) RouteServiceArrayOutput
}

type RouteServiceArray []RouteServiceInput

func (RouteServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteService)(nil)).Elem()
}

func (i RouteServiceArray) ToRouteServiceArrayOutput() RouteServiceArrayOutput {
	return i.ToRouteServiceArrayOutputWithContext(context.Background())
}

func (i RouteServiceArray) ToRouteServiceArrayOutputWithContext(ctx context.Context) RouteServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteServiceArrayOutput)
}

// RouteServiceMapInput is an input type that accepts RouteServiceMap and RouteServiceMapOutput values.
// You can construct a concrete instance of `RouteServiceMapInput` via:
//
//	RouteServiceMap{ "key": RouteServiceArgs{...} }
type RouteServiceMapInput interface {
	pulumi.Input

	ToRouteServiceMapOutput() RouteServiceMapOutput
	ToRouteServiceMapOutputWithContext(context.Context) RouteServiceMapOutput
}

type RouteServiceMap map[string]RouteServiceInput

func (RouteServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteService)(nil)).Elem()
}

func (i RouteServiceMap) ToRouteServiceMapOutput() RouteServiceMapOutput {
	return i.ToRouteServiceMapOutputWithContext(context.Background())
}

func (i RouteServiceMap) ToRouteServiceMapOutputWithContext(ctx context.Context) RouteServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteServiceMapOutput)
}

type RouteServiceOutput struct{ *pulumi.OutputState }

func (RouteServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteService)(nil)).Elem()
}

func (o RouteServiceOutput) ToRouteServiceOutput() RouteServiceOutput {
	return o
}

func (o RouteServiceOutput) ToRouteServiceOutputWithContext(ctx context.Context) RouteServiceOutput {
	return o
}

// The region of the network instances that access the cloud services.
func (o RouteServiceOutput) AccessRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringOutput { return v.AccessRegionId }).(pulumi.StringOutput)
}

// The ID of the CEN instance.
func (o RouteServiceOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// The description of the cloud service.
func (o RouteServiceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The domain name or IP address of the cloud service.
func (o RouteServiceOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// The region of the cloud service.
func (o RouteServiceOutput) HostRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringOutput { return v.HostRegionId }).(pulumi.StringOutput)
}

// The VPC associated with the cloud service.
func (o RouteServiceOutput) HostVpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringOutput { return v.HostVpcId }).(pulumi.StringOutput)
}

// The status of the cloud service.
func (o RouteServiceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteService) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type RouteServiceArrayOutput struct{ *pulumi.OutputState }

func (RouteServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteService)(nil)).Elem()
}

func (o RouteServiceArrayOutput) ToRouteServiceArrayOutput() RouteServiceArrayOutput {
	return o
}

func (o RouteServiceArrayOutput) ToRouteServiceArrayOutputWithContext(ctx context.Context) RouteServiceArrayOutput {
	return o
}

func (o RouteServiceArrayOutput) Index(i pulumi.IntInput) RouteServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouteService {
		return vs[0].([]*RouteService)[vs[1].(int)]
	}).(RouteServiceOutput)
}

type RouteServiceMapOutput struct{ *pulumi.OutputState }

func (RouteServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteService)(nil)).Elem()
}

func (o RouteServiceMapOutput) ToRouteServiceMapOutput() RouteServiceMapOutput {
	return o
}

func (o RouteServiceMapOutput) ToRouteServiceMapOutputWithContext(ctx context.Context) RouteServiceMapOutput {
	return o
}

func (o RouteServiceMapOutput) MapIndex(k pulumi.StringInput) RouteServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouteService {
		return vs[0].(map[string]*RouteService)[vs[1].(string)]
	}).(RouteServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteServiceInput)(nil)).Elem(), &RouteService{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteServiceArrayInput)(nil)).Elem(), RouteServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteServiceMapInput)(nil)).Elem(), RouteServiceMap{})
	pulumi.RegisterOutputType(RouteServiceOutput{})
	pulumi.RegisterOutputType(RouteServiceArrayOutput{})
	pulumi.RegisterOutputType(RouteServiceMapOutput{})
}
