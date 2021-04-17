// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Reserved Instance resource.
//
// > **NOTE:** Available in 1.65.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ecs.NewReservedInstance(ctx, "_default", &ecs.ReservedInstanceArgs{
// 			InstanceType:   pulumi.String("ecs.g6.large"),
// 			InstanceAmount: pulumi.Int(1),
// 			PeriodUnit:     pulumi.String("Year"),
// 			OfferingType:   pulumi.String("All Upfront"),
// 			Description:    pulumi.String("ReservedInstance"),
// 			ZoneId:         pulumi.String("cn-hangzhou-h"),
// 			Scope:          pulumi.String("Zone"),
// 			Period:         pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// reservedInstance can be imported using id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/reservedInstance:ReservedInstance default ecsri-uf6df4xm0h3licit****
// ```
type ReservedInstance struct {
	pulumi.CustomResourceState

	// Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
	InstanceAmount pulumi.IntOutput `pulumi:"instanceAmount"`
	// Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
	Name pulumi.StringOutput `pulumi:"name"`
	// Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
	OfferingType pulumi.StringPtrOutput `pulumi:"offeringType"`
	Period       pulumi.IntPtrOutput    `pulumi:"period"`
	// Term unit. Optional value: Year.
	PeriodUnit pulumi.StringPtrOutput `pulumi:"periodUnit"`
	// The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
	Platform pulumi.StringOutput `pulumi:"platform"`
	// Resource group ID.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
	Scope pulumi.StringPtrOutput `pulumi:"scope"`
	// ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewReservedInstance registers a new resource with the given unique name, arguments, and options.
func NewReservedInstance(ctx *pulumi.Context,
	name string, args *ReservedInstanceArgs, opts ...pulumi.ResourceOption) (*ReservedInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	var resource ReservedInstance
	err := ctx.RegisterResource("alicloud:ecs/reservedInstance:ReservedInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReservedInstance gets an existing ReservedInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReservedInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReservedInstanceState, opts ...pulumi.ResourceOption) (*ReservedInstance, error) {
	var resource ReservedInstance
	err := ctx.ReadResource("alicloud:ecs/reservedInstance:ReservedInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReservedInstance resources.
type reservedInstanceState struct {
	// Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
	InstanceAmount *int `pulumi:"instanceAmount"`
	// Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
	InstanceType *string `pulumi:"instanceType"`
	// Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
	Name *string `pulumi:"name"`
	// Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
	OfferingType *string `pulumi:"offeringType"`
	Period       *int    `pulumi:"period"`
	// Term unit. Optional value: Year.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
	Platform *string `pulumi:"platform"`
	// Resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
	Scope *string `pulumi:"scope"`
	// ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
	ZoneId *string `pulumi:"zoneId"`
}

type ReservedInstanceState struct {
	// Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
	InstanceAmount pulumi.IntPtrInput
	// Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
	InstanceType pulumi.StringPtrInput
	// Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
	Name pulumi.StringPtrInput
	// Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
	OfferingType pulumi.StringPtrInput
	Period       pulumi.IntPtrInput
	// Term unit. Optional value: Year.
	PeriodUnit pulumi.StringPtrInput
	// The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
	Platform pulumi.StringPtrInput
	// Resource group ID.
	ResourceGroupId pulumi.StringPtrInput
	// Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
	Scope pulumi.StringPtrInput
	// ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
	ZoneId pulumi.StringPtrInput
}

func (ReservedInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedInstanceState)(nil)).Elem()
}

type reservedInstanceArgs struct {
	// Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
	InstanceAmount *int `pulumi:"instanceAmount"`
	// Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
	InstanceType string `pulumi:"instanceType"`
	// Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
	Name *string `pulumi:"name"`
	// Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
	OfferingType *string `pulumi:"offeringType"`
	Period       *int    `pulumi:"period"`
	// Term unit. Optional value: Year.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
	Platform *string `pulumi:"platform"`
	// Resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
	Scope *string `pulumi:"scope"`
	// ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ReservedInstance resource.
type ReservedInstanceArgs struct {
	// Description of the RI. 2 to 256 English or Chinese characters. It cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// Number of instances allocated to an RI (An RI is a coupon that includes one or more allocated instances.).
	InstanceAmount pulumi.IntPtrInput
	// Instance type of the RI. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.html).
	InstanceType pulumi.StringInput
	// Name of the RI. The name must be a string of 2 to 128 characters in length and can contain letters, numbers, colons (:), underscores (_), and hyphens. It must start with a letter. It cannot start with http:// or https://.
	Name pulumi.StringPtrInput
	// Payment type of the RI. Optional values: `No Upfront`: No upfront payment is required., `Partial Upfront`: A portion of upfront payment is required.`All Upfront`: Full upfront payment is required.
	OfferingType pulumi.StringPtrInput
	Period       pulumi.IntPtrInput
	// Term unit. Optional value: Year.
	PeriodUnit pulumi.StringPtrInput
	// The operating system type of the image used by the instance. Optional values: `Windows`, `Linux`. Default is `Linux`.
	Platform pulumi.StringPtrInput
	// Resource group ID.
	ResourceGroupId pulumi.StringPtrInput
	// Scope of the RI. Optional values: `Region`: region-level, `Zone`: zone-level. Default is `Region`.
	Scope pulumi.StringPtrInput
	// ID of the zone to which the RI belongs. When Scope is set to Zone, this parameter is required. For information about the zone list, see [DescribeZones](https://www.alibabacloud.com/help/doc-detail/25610.html).
	ZoneId pulumi.StringPtrInput
}

func (ReservedInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedInstanceArgs)(nil)).Elem()
}

type ReservedInstanceInput interface {
	pulumi.Input

	ToReservedInstanceOutput() ReservedInstanceOutput
	ToReservedInstanceOutputWithContext(ctx context.Context) ReservedInstanceOutput
}

func (*ReservedInstance) ElementType() reflect.Type {
	return reflect.TypeOf((*ReservedInstance)(nil))
}

func (i *ReservedInstance) ToReservedInstanceOutput() ReservedInstanceOutput {
	return i.ToReservedInstanceOutputWithContext(context.Background())
}

func (i *ReservedInstance) ToReservedInstanceOutputWithContext(ctx context.Context) ReservedInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedInstanceOutput)
}

func (i *ReservedInstance) ToReservedInstancePtrOutput() ReservedInstancePtrOutput {
	return i.ToReservedInstancePtrOutputWithContext(context.Background())
}

func (i *ReservedInstance) ToReservedInstancePtrOutputWithContext(ctx context.Context) ReservedInstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedInstancePtrOutput)
}

type ReservedInstancePtrInput interface {
	pulumi.Input

	ToReservedInstancePtrOutput() ReservedInstancePtrOutput
	ToReservedInstancePtrOutputWithContext(ctx context.Context) ReservedInstancePtrOutput
}

type reservedInstancePtrType ReservedInstanceArgs

func (*reservedInstancePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedInstance)(nil))
}

func (i *reservedInstancePtrType) ToReservedInstancePtrOutput() ReservedInstancePtrOutput {
	return i.ToReservedInstancePtrOutputWithContext(context.Background())
}

func (i *reservedInstancePtrType) ToReservedInstancePtrOutputWithContext(ctx context.Context) ReservedInstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedInstancePtrOutput)
}

// ReservedInstanceArrayInput is an input type that accepts ReservedInstanceArray and ReservedInstanceArrayOutput values.
// You can construct a concrete instance of `ReservedInstanceArrayInput` via:
//
//          ReservedInstanceArray{ ReservedInstanceArgs{...} }
type ReservedInstanceArrayInput interface {
	pulumi.Input

	ToReservedInstanceArrayOutput() ReservedInstanceArrayOutput
	ToReservedInstanceArrayOutputWithContext(context.Context) ReservedInstanceArrayOutput
}

type ReservedInstanceArray []ReservedInstanceInput

func (ReservedInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ReservedInstance)(nil))
}

func (i ReservedInstanceArray) ToReservedInstanceArrayOutput() ReservedInstanceArrayOutput {
	return i.ToReservedInstanceArrayOutputWithContext(context.Background())
}

func (i ReservedInstanceArray) ToReservedInstanceArrayOutputWithContext(ctx context.Context) ReservedInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedInstanceArrayOutput)
}

// ReservedInstanceMapInput is an input type that accepts ReservedInstanceMap and ReservedInstanceMapOutput values.
// You can construct a concrete instance of `ReservedInstanceMapInput` via:
//
//          ReservedInstanceMap{ "key": ReservedInstanceArgs{...} }
type ReservedInstanceMapInput interface {
	pulumi.Input

	ToReservedInstanceMapOutput() ReservedInstanceMapOutput
	ToReservedInstanceMapOutputWithContext(context.Context) ReservedInstanceMapOutput
}

type ReservedInstanceMap map[string]ReservedInstanceInput

func (ReservedInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ReservedInstance)(nil))
}

func (i ReservedInstanceMap) ToReservedInstanceMapOutput() ReservedInstanceMapOutput {
	return i.ToReservedInstanceMapOutputWithContext(context.Background())
}

func (i ReservedInstanceMap) ToReservedInstanceMapOutputWithContext(ctx context.Context) ReservedInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedInstanceMapOutput)
}

type ReservedInstanceOutput struct {
	*pulumi.OutputState
}

func (ReservedInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ReservedInstance)(nil))
}

func (o ReservedInstanceOutput) ToReservedInstanceOutput() ReservedInstanceOutput {
	return o
}

func (o ReservedInstanceOutput) ToReservedInstanceOutputWithContext(ctx context.Context) ReservedInstanceOutput {
	return o
}

func (o ReservedInstanceOutput) ToReservedInstancePtrOutput() ReservedInstancePtrOutput {
	return o.ToReservedInstancePtrOutputWithContext(context.Background())
}

func (o ReservedInstanceOutput) ToReservedInstancePtrOutputWithContext(ctx context.Context) ReservedInstancePtrOutput {
	return o.ApplyT(func(v ReservedInstance) *ReservedInstance {
		return &v
	}).(ReservedInstancePtrOutput)
}

type ReservedInstancePtrOutput struct {
	*pulumi.OutputState
}

func (ReservedInstancePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedInstance)(nil))
}

func (o ReservedInstancePtrOutput) ToReservedInstancePtrOutput() ReservedInstancePtrOutput {
	return o
}

func (o ReservedInstancePtrOutput) ToReservedInstancePtrOutputWithContext(ctx context.Context) ReservedInstancePtrOutput {
	return o
}

type ReservedInstanceArrayOutput struct{ *pulumi.OutputState }

func (ReservedInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ReservedInstance)(nil))
}

func (o ReservedInstanceArrayOutput) ToReservedInstanceArrayOutput() ReservedInstanceArrayOutput {
	return o
}

func (o ReservedInstanceArrayOutput) ToReservedInstanceArrayOutputWithContext(ctx context.Context) ReservedInstanceArrayOutput {
	return o
}

func (o ReservedInstanceArrayOutput) Index(i pulumi.IntInput) ReservedInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ReservedInstance {
		return vs[0].([]ReservedInstance)[vs[1].(int)]
	}).(ReservedInstanceOutput)
}

type ReservedInstanceMapOutput struct{ *pulumi.OutputState }

func (ReservedInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ReservedInstance)(nil))
}

func (o ReservedInstanceMapOutput) ToReservedInstanceMapOutput() ReservedInstanceMapOutput {
	return o
}

func (o ReservedInstanceMapOutput) ToReservedInstanceMapOutputWithContext(ctx context.Context) ReservedInstanceMapOutput {
	return o
}

func (o ReservedInstanceMapOutput) MapIndex(k pulumi.StringInput) ReservedInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ReservedInstance {
		return vs[0].(map[string]ReservedInstance)[vs[1].(string)]
	}).(ReservedInstanceOutput)
}

func init() {
	pulumi.RegisterOutputType(ReservedInstanceOutput{})
	pulumi.RegisterOutputType(ReservedInstancePtrOutput{})
	pulumi.RegisterOutputType(ReservedInstanceArrayOutput{})
	pulumi.RegisterOutputType(ReservedInstanceMapOutput{})
}
