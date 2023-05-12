// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This topic describes how to configure PrivateZone access.
// PrivateZone is a VPC-based resolution and management service for private domain names.
// After you set a PrivateZone access, the Cloud Connect Network (CCN) and Virtual Border Router (VBR) attached to a CEN instance can access the PrivateZone service through CEN.
//
// For information about CEN Private Zone and how to use it, see [Manage CEN Private Zone](https://www.alibabacloud.com/help/en/doc-detail/106693.htm).
//
// > **NOTE:** Available in 1.83.0+
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
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultInstance, err := cen.NewInstance(ctx, "defaultInstance", nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("test_name"),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstanceAttachment, err := cen.NewInstanceAttachment(ctx, "defaultInstanceAttachment", &cen.InstanceAttachmentArgs{
//				InstanceId:            defaultInstance.ID(),
//				ChildInstanceId:       defaultNetwork.ID(),
//				ChildInstanceType:     pulumi.String("VPC"),
//				ChildInstanceRegionId: pulumi.String("cn-hangzhou"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				defaultInstance,
//				defaultNetwork,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = cen.NewPrivateZone(ctx, "defaultPrivateZone", &cen.PrivateZoneArgs{
//				AccessRegionId: pulumi.String("cn-hangzhou"),
//				CenId:          defaultInstance.ID(),
//				HostRegionId:   pulumi.String("cn-hangzhou"),
//				HostVpcId:      defaultNetwork.ID(),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				defaultInstanceAttachment,
//			}))
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
// CEN Private Zone can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/privateZone:PrivateZone example cen-abc123456:cn-hangzhou
//
// ```
type PrivateZone struct {
	pulumi.CustomResourceState

	// The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
	AccessRegionId pulumi.StringOutput `pulumi:"accessRegionId"`
	// The ID of the CEN instance.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
	HostRegionId pulumi.StringOutput `pulumi:"hostRegionId"`
	// The VPC that belongs to the service region.
	//
	// ->**NOTE:** The "cen.PrivateZone" resource depends on the related "cen.InstanceAttachment" resource.
	HostVpcId pulumi.StringOutput `pulumi:"hostVpcId"`
	// The status of the PrivateZone service. Valid values: ["Creating", "Active", "Deleting"].
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPrivateZone registers a new resource with the given unique name, arguments, and options.
func NewPrivateZone(ctx *pulumi.Context,
	name string, args *PrivateZoneArgs, opts ...pulumi.ResourceOption) (*PrivateZone, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessRegionId == nil {
		return nil, errors.New("invalid value for required argument 'AccessRegionId'")
	}
	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.HostRegionId == nil {
		return nil, errors.New("invalid value for required argument 'HostRegionId'")
	}
	if args.HostVpcId == nil {
		return nil, errors.New("invalid value for required argument 'HostVpcId'")
	}
	var resource PrivateZone
	err := ctx.RegisterResource("alicloud:cen/privateZone:PrivateZone", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateZone gets an existing PrivateZone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateZone(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateZoneState, opts ...pulumi.ResourceOption) (*PrivateZone, error) {
	var resource PrivateZone
	err := ctx.ReadResource("alicloud:cen/privateZone:PrivateZone", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateZone resources.
type privateZoneState struct {
	// The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
	AccessRegionId *string `pulumi:"accessRegionId"`
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
	HostRegionId *string `pulumi:"hostRegionId"`
	// The VPC that belongs to the service region.
	//
	// ->**NOTE:** The "cen.PrivateZone" resource depends on the related "cen.InstanceAttachment" resource.
	HostVpcId *string `pulumi:"hostVpcId"`
	// The status of the PrivateZone service. Valid values: ["Creating", "Active", "Deleting"].
	Status *string `pulumi:"status"`
}

type PrivateZoneState struct {
	// The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
	AccessRegionId pulumi.StringPtrInput
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput
	// The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
	HostRegionId pulumi.StringPtrInput
	// The VPC that belongs to the service region.
	//
	// ->**NOTE:** The "cen.PrivateZone" resource depends on the related "cen.InstanceAttachment" resource.
	HostVpcId pulumi.StringPtrInput
	// The status of the PrivateZone service. Valid values: ["Creating", "Active", "Deleting"].
	Status pulumi.StringPtrInput
}

func (PrivateZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateZoneState)(nil)).Elem()
}

type privateZoneArgs struct {
	// The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
	AccessRegionId string `pulumi:"accessRegionId"`
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
	HostRegionId string `pulumi:"hostRegionId"`
	// The VPC that belongs to the service region.
	//
	// ->**NOTE:** The "cen.PrivateZone" resource depends on the related "cen.InstanceAttachment" resource.
	HostVpcId string `pulumi:"hostVpcId"`
}

// The set of arguments for constructing a PrivateZone resource.
type PrivateZoneArgs struct {
	// The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
	AccessRegionId pulumi.StringInput
	// The ID of the CEN instance.
	CenId pulumi.StringInput
	// The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
	HostRegionId pulumi.StringInput
	// The VPC that belongs to the service region.
	//
	// ->**NOTE:** The "cen.PrivateZone" resource depends on the related "cen.InstanceAttachment" resource.
	HostVpcId pulumi.StringInput
}

func (PrivateZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateZoneArgs)(nil)).Elem()
}

type PrivateZoneInput interface {
	pulumi.Input

	ToPrivateZoneOutput() PrivateZoneOutput
	ToPrivateZoneOutputWithContext(ctx context.Context) PrivateZoneOutput
}

func (*PrivateZone) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateZone)(nil)).Elem()
}

func (i *PrivateZone) ToPrivateZoneOutput() PrivateZoneOutput {
	return i.ToPrivateZoneOutputWithContext(context.Background())
}

func (i *PrivateZone) ToPrivateZoneOutputWithContext(ctx context.Context) PrivateZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateZoneOutput)
}

// PrivateZoneArrayInput is an input type that accepts PrivateZoneArray and PrivateZoneArrayOutput values.
// You can construct a concrete instance of `PrivateZoneArrayInput` via:
//
//	PrivateZoneArray{ PrivateZoneArgs{...} }
type PrivateZoneArrayInput interface {
	pulumi.Input

	ToPrivateZoneArrayOutput() PrivateZoneArrayOutput
	ToPrivateZoneArrayOutputWithContext(context.Context) PrivateZoneArrayOutput
}

type PrivateZoneArray []PrivateZoneInput

func (PrivateZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateZone)(nil)).Elem()
}

func (i PrivateZoneArray) ToPrivateZoneArrayOutput() PrivateZoneArrayOutput {
	return i.ToPrivateZoneArrayOutputWithContext(context.Background())
}

func (i PrivateZoneArray) ToPrivateZoneArrayOutputWithContext(ctx context.Context) PrivateZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateZoneArrayOutput)
}

// PrivateZoneMapInput is an input type that accepts PrivateZoneMap and PrivateZoneMapOutput values.
// You can construct a concrete instance of `PrivateZoneMapInput` via:
//
//	PrivateZoneMap{ "key": PrivateZoneArgs{...} }
type PrivateZoneMapInput interface {
	pulumi.Input

	ToPrivateZoneMapOutput() PrivateZoneMapOutput
	ToPrivateZoneMapOutputWithContext(context.Context) PrivateZoneMapOutput
}

type PrivateZoneMap map[string]PrivateZoneInput

func (PrivateZoneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateZone)(nil)).Elem()
}

func (i PrivateZoneMap) ToPrivateZoneMapOutput() PrivateZoneMapOutput {
	return i.ToPrivateZoneMapOutputWithContext(context.Background())
}

func (i PrivateZoneMap) ToPrivateZoneMapOutputWithContext(ctx context.Context) PrivateZoneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateZoneMapOutput)
}

type PrivateZoneOutput struct{ *pulumi.OutputState }

func (PrivateZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateZone)(nil)).Elem()
}

func (o PrivateZoneOutput) ToPrivateZoneOutput() PrivateZoneOutput {
	return o
}

func (o PrivateZoneOutput) ToPrivateZoneOutputWithContext(ctx context.Context) PrivateZoneOutput {
	return o
}

// The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
func (o PrivateZoneOutput) AccessRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateZone) pulumi.StringOutput { return v.AccessRegionId }).(pulumi.StringOutput)
}

// The ID of the CEN instance.
func (o PrivateZoneOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateZone) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
func (o PrivateZoneOutput) HostRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateZone) pulumi.StringOutput { return v.HostRegionId }).(pulumi.StringOutput)
}

// The VPC that belongs to the service region.
//
// ->**NOTE:** The "cen.PrivateZone" resource depends on the related "cen.InstanceAttachment" resource.
func (o PrivateZoneOutput) HostVpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateZone) pulumi.StringOutput { return v.HostVpcId }).(pulumi.StringOutput)
}

// The status of the PrivateZone service. Valid values: ["Creating", "Active", "Deleting"].
func (o PrivateZoneOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateZone) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type PrivateZoneArrayOutput struct{ *pulumi.OutputState }

func (PrivateZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateZone)(nil)).Elem()
}

func (o PrivateZoneArrayOutput) ToPrivateZoneArrayOutput() PrivateZoneArrayOutput {
	return o
}

func (o PrivateZoneArrayOutput) ToPrivateZoneArrayOutputWithContext(ctx context.Context) PrivateZoneArrayOutput {
	return o
}

func (o PrivateZoneArrayOutput) Index(i pulumi.IntInput) PrivateZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateZone {
		return vs[0].([]*PrivateZone)[vs[1].(int)]
	}).(PrivateZoneOutput)
}

type PrivateZoneMapOutput struct{ *pulumi.OutputState }

func (PrivateZoneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateZone)(nil)).Elem()
}

func (o PrivateZoneMapOutput) ToPrivateZoneMapOutput() PrivateZoneMapOutput {
	return o
}

func (o PrivateZoneMapOutput) ToPrivateZoneMapOutputWithContext(ctx context.Context) PrivateZoneMapOutput {
	return o
}

func (o PrivateZoneMapOutput) MapIndex(k pulumi.StringInput) PrivateZoneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateZone {
		return vs[0].(map[string]*PrivateZone)[vs[1].(string)]
	}).(PrivateZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateZoneInput)(nil)).Elem(), &PrivateZone{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateZoneArrayInput)(nil)).Elem(), PrivateZoneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateZoneMapInput)(nil)).Elem(), PrivateZoneMap{})
	pulumi.RegisterOutputType(PrivateZoneOutput{})
	pulumi.RegisterOutputType(PrivateZoneArrayOutput{})
	pulumi.RegisterOutputType(PrivateZoneMapOutput{})
}
