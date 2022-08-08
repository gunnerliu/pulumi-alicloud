// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Global Accelerator (GA) Bandwidth Package Attachment resource.
//
// For information about Global Accelerator (GA) Bandwidth Package Attachment and how to use it, see [What is Bandwidth Package Attachment](https://www.alibabacloud.com/help/en/doc-detail/153241.htm).
//
// > **NOTE:** Available in v1.113.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ga"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleAccelerator, err := ga.NewAccelerator(ctx, "exampleAccelerator", &ga.AcceleratorArgs{
// 			Duration:      pulumi.Int(1),
// 			AutoUseCoupon: pulumi.Bool(true),
// 			Spec:          pulumi.String("1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleBandwidthPackage, err := ga.NewBandwidthPackage(ctx, "exampleBandwidthPackage", &ga.BandwidthPackageArgs{
// 			Bandwidth:     pulumi.Int(20),
// 			Type:          pulumi.String("Basic"),
// 			BandwidthType: pulumi.String("Basic"),
// 			Duration:      pulumi.String("1"),
// 			AutoPay:       pulumi.Bool(true),
// 			Ratio:         pulumi.Int(30),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ga.NewBandwidthPackageAttachment(ctx, "exampleBandwidthPackageAttachment", &ga.BandwidthPackageAttachmentArgs{
// 			AcceleratorId:      exampleAccelerator.ID(),
// 			BandwidthPackageId: exampleBandwidthPackage.ID(),
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
// Ga Bandwidth Package Attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ga/bandwidthPackageAttachment:BandwidthPackageAttachment example <accelerator_id>:<bandwidth_package_id>
// ```
type BandwidthPackageAttachment struct {
	pulumi.CustomResourceState

	// The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
	AcceleratorId pulumi.StringOutput `pulumi:"acceleratorId"`
	// Accelerators bound with current Bandwidth Package.
	Accelerators pulumi.StringArrayOutput `pulumi:"accelerators"`
	// The ID of the bandwidth plan to disassociate.
	BandwidthPackageId pulumi.StringOutput `pulumi:"bandwidthPackageId"`
	// State of Bandwidth Package.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewBandwidthPackageAttachment registers a new resource with the given unique name, arguments, and options.
func NewBandwidthPackageAttachment(ctx *pulumi.Context,
	name string, args *BandwidthPackageAttachmentArgs, opts ...pulumi.ResourceOption) (*BandwidthPackageAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AcceleratorId == nil {
		return nil, errors.New("invalid value for required argument 'AcceleratorId'")
	}
	if args.BandwidthPackageId == nil {
		return nil, errors.New("invalid value for required argument 'BandwidthPackageId'")
	}
	var resource BandwidthPackageAttachment
	err := ctx.RegisterResource("alicloud:ga/bandwidthPackageAttachment:BandwidthPackageAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBandwidthPackageAttachment gets an existing BandwidthPackageAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBandwidthPackageAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BandwidthPackageAttachmentState, opts ...pulumi.ResourceOption) (*BandwidthPackageAttachment, error) {
	var resource BandwidthPackageAttachment
	err := ctx.ReadResource("alicloud:ga/bandwidthPackageAttachment:BandwidthPackageAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BandwidthPackageAttachment resources.
type bandwidthPackageAttachmentState struct {
	// The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
	AcceleratorId *string `pulumi:"acceleratorId"`
	// Accelerators bound with current Bandwidth Package.
	Accelerators []string `pulumi:"accelerators"`
	// The ID of the bandwidth plan to disassociate.
	BandwidthPackageId *string `pulumi:"bandwidthPackageId"`
	// State of Bandwidth Package.
	Status *string `pulumi:"status"`
}

type BandwidthPackageAttachmentState struct {
	// The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
	AcceleratorId pulumi.StringPtrInput
	// Accelerators bound with current Bandwidth Package.
	Accelerators pulumi.StringArrayInput
	// The ID of the bandwidth plan to disassociate.
	BandwidthPackageId pulumi.StringPtrInput
	// State of Bandwidth Package.
	Status pulumi.StringPtrInput
}

func (BandwidthPackageAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*bandwidthPackageAttachmentState)(nil)).Elem()
}

type bandwidthPackageAttachmentArgs struct {
	// The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
	AcceleratorId string `pulumi:"acceleratorId"`
	// The ID of the bandwidth plan to disassociate.
	BandwidthPackageId string `pulumi:"bandwidthPackageId"`
}

// The set of arguments for constructing a BandwidthPackageAttachment resource.
type BandwidthPackageAttachmentArgs struct {
	// The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
	AcceleratorId pulumi.StringInput
	// The ID of the bandwidth plan to disassociate.
	BandwidthPackageId pulumi.StringInput
}

func (BandwidthPackageAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bandwidthPackageAttachmentArgs)(nil)).Elem()
}

type BandwidthPackageAttachmentInput interface {
	pulumi.Input

	ToBandwidthPackageAttachmentOutput() BandwidthPackageAttachmentOutput
	ToBandwidthPackageAttachmentOutputWithContext(ctx context.Context) BandwidthPackageAttachmentOutput
}

func (*BandwidthPackageAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**BandwidthPackageAttachment)(nil)).Elem()
}

func (i *BandwidthPackageAttachment) ToBandwidthPackageAttachmentOutput() BandwidthPackageAttachmentOutput {
	return i.ToBandwidthPackageAttachmentOutputWithContext(context.Background())
}

func (i *BandwidthPackageAttachment) ToBandwidthPackageAttachmentOutputWithContext(ctx context.Context) BandwidthPackageAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthPackageAttachmentOutput)
}

// BandwidthPackageAttachmentArrayInput is an input type that accepts BandwidthPackageAttachmentArray and BandwidthPackageAttachmentArrayOutput values.
// You can construct a concrete instance of `BandwidthPackageAttachmentArrayInput` via:
//
//          BandwidthPackageAttachmentArray{ BandwidthPackageAttachmentArgs{...} }
type BandwidthPackageAttachmentArrayInput interface {
	pulumi.Input

	ToBandwidthPackageAttachmentArrayOutput() BandwidthPackageAttachmentArrayOutput
	ToBandwidthPackageAttachmentArrayOutputWithContext(context.Context) BandwidthPackageAttachmentArrayOutput
}

type BandwidthPackageAttachmentArray []BandwidthPackageAttachmentInput

func (BandwidthPackageAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BandwidthPackageAttachment)(nil)).Elem()
}

func (i BandwidthPackageAttachmentArray) ToBandwidthPackageAttachmentArrayOutput() BandwidthPackageAttachmentArrayOutput {
	return i.ToBandwidthPackageAttachmentArrayOutputWithContext(context.Background())
}

func (i BandwidthPackageAttachmentArray) ToBandwidthPackageAttachmentArrayOutputWithContext(ctx context.Context) BandwidthPackageAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthPackageAttachmentArrayOutput)
}

// BandwidthPackageAttachmentMapInput is an input type that accepts BandwidthPackageAttachmentMap and BandwidthPackageAttachmentMapOutput values.
// You can construct a concrete instance of `BandwidthPackageAttachmentMapInput` via:
//
//          BandwidthPackageAttachmentMap{ "key": BandwidthPackageAttachmentArgs{...} }
type BandwidthPackageAttachmentMapInput interface {
	pulumi.Input

	ToBandwidthPackageAttachmentMapOutput() BandwidthPackageAttachmentMapOutput
	ToBandwidthPackageAttachmentMapOutputWithContext(context.Context) BandwidthPackageAttachmentMapOutput
}

type BandwidthPackageAttachmentMap map[string]BandwidthPackageAttachmentInput

func (BandwidthPackageAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BandwidthPackageAttachment)(nil)).Elem()
}

func (i BandwidthPackageAttachmentMap) ToBandwidthPackageAttachmentMapOutput() BandwidthPackageAttachmentMapOutput {
	return i.ToBandwidthPackageAttachmentMapOutputWithContext(context.Background())
}

func (i BandwidthPackageAttachmentMap) ToBandwidthPackageAttachmentMapOutputWithContext(ctx context.Context) BandwidthPackageAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BandwidthPackageAttachmentMapOutput)
}

type BandwidthPackageAttachmentOutput struct{ *pulumi.OutputState }

func (BandwidthPackageAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BandwidthPackageAttachment)(nil)).Elem()
}

func (o BandwidthPackageAttachmentOutput) ToBandwidthPackageAttachmentOutput() BandwidthPackageAttachmentOutput {
	return o
}

func (o BandwidthPackageAttachmentOutput) ToBandwidthPackageAttachmentOutputWithContext(ctx context.Context) BandwidthPackageAttachmentOutput {
	return o
}

// The ID of the Global Accelerator instance from which you want to disassociate the bandwidth plan.
func (o BandwidthPackageAttachmentOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackageAttachment) pulumi.StringOutput { return v.AcceleratorId }).(pulumi.StringOutput)
}

// Accelerators bound with current Bandwidth Package.
func (o BandwidthPackageAttachmentOutput) Accelerators() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BandwidthPackageAttachment) pulumi.StringArrayOutput { return v.Accelerators }).(pulumi.StringArrayOutput)
}

// The ID of the bandwidth plan to disassociate.
func (o BandwidthPackageAttachmentOutput) BandwidthPackageId() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackageAttachment) pulumi.StringOutput { return v.BandwidthPackageId }).(pulumi.StringOutput)
}

// State of Bandwidth Package.
func (o BandwidthPackageAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *BandwidthPackageAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type BandwidthPackageAttachmentArrayOutput struct{ *pulumi.OutputState }

func (BandwidthPackageAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BandwidthPackageAttachment)(nil)).Elem()
}

func (o BandwidthPackageAttachmentArrayOutput) ToBandwidthPackageAttachmentArrayOutput() BandwidthPackageAttachmentArrayOutput {
	return o
}

func (o BandwidthPackageAttachmentArrayOutput) ToBandwidthPackageAttachmentArrayOutputWithContext(ctx context.Context) BandwidthPackageAttachmentArrayOutput {
	return o
}

func (o BandwidthPackageAttachmentArrayOutput) Index(i pulumi.IntInput) BandwidthPackageAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BandwidthPackageAttachment {
		return vs[0].([]*BandwidthPackageAttachment)[vs[1].(int)]
	}).(BandwidthPackageAttachmentOutput)
}

type BandwidthPackageAttachmentMapOutput struct{ *pulumi.OutputState }

func (BandwidthPackageAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BandwidthPackageAttachment)(nil)).Elem()
}

func (o BandwidthPackageAttachmentMapOutput) ToBandwidthPackageAttachmentMapOutput() BandwidthPackageAttachmentMapOutput {
	return o
}

func (o BandwidthPackageAttachmentMapOutput) ToBandwidthPackageAttachmentMapOutputWithContext(ctx context.Context) BandwidthPackageAttachmentMapOutput {
	return o
}

func (o BandwidthPackageAttachmentMapOutput) MapIndex(k pulumi.StringInput) BandwidthPackageAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BandwidthPackageAttachment {
		return vs[0].(map[string]*BandwidthPackageAttachment)[vs[1].(string)]
	}).(BandwidthPackageAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthPackageAttachmentInput)(nil)).Elem(), &BandwidthPackageAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthPackageAttachmentArrayInput)(nil)).Elem(), BandwidthPackageAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BandwidthPackageAttachmentMapInput)(nil)).Elem(), BandwidthPackageAttachmentMap{})
	pulumi.RegisterOutputType(BandwidthPackageAttachmentOutput{})
	pulumi.RegisterOutputType(BandwidthPackageAttachmentArrayOutput{})
	pulumi.RegisterOutputType(BandwidthPackageAttachmentMapOutput{})
}
