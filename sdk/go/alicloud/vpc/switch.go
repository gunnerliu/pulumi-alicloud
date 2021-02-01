// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Vswitch can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:vpc/switch:Switch example vsw-abc123456
// ```
type Switch struct {
	pulumi.CustomResourceState

	// The AZ for the switch.
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// The CIDR block for the switch.
	CidrBlock pulumi.StringOutput `pulumi:"cidrBlock"`
	// The switch description. Defaults to null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the switch. Defaults to null.
	Name pulumi.StringOutput `pulumi:"name"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The VPC ID.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewSwitch registers a new resource with the given unique name, arguments, and options.
func NewSwitch(ctx *pulumi.Context,
	name string, args *SwitchArgs, opts ...pulumi.ResourceOption) (*Switch, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AvailabilityZone == nil {
		return nil, errors.New("invalid value for required argument 'AvailabilityZone'")
	}
	if args.CidrBlock == nil {
		return nil, errors.New("invalid value for required argument 'CidrBlock'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	var resource Switch
	err := ctx.RegisterResource("alicloud:vpc/switch:Switch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitch gets an existing Switch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchState, opts ...pulumi.ResourceOption) (*Switch, error) {
	var resource Switch
	err := ctx.ReadResource("alicloud:vpc/switch:Switch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Switch resources.
type switchState struct {
	// The AZ for the switch.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The CIDR block for the switch.
	CidrBlock *string `pulumi:"cidrBlock"`
	// The switch description. Defaults to null.
	Description *string `pulumi:"description"`
	// The name of the switch. Defaults to null.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The VPC ID.
	VpcId *string `pulumi:"vpcId"`
}

type SwitchState struct {
	// The AZ for the switch.
	AvailabilityZone pulumi.StringPtrInput
	// The CIDR block for the switch.
	CidrBlock pulumi.StringPtrInput
	// The switch description. Defaults to null.
	Description pulumi.StringPtrInput
	// The name of the switch. Defaults to null.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The VPC ID.
	VpcId pulumi.StringPtrInput
}

func (SwitchState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchState)(nil)).Elem()
}

type switchArgs struct {
	// The AZ for the switch.
	AvailabilityZone string `pulumi:"availabilityZone"`
	// The CIDR block for the switch.
	CidrBlock string `pulumi:"cidrBlock"`
	// The switch description. Defaults to null.
	Description *string `pulumi:"description"`
	// The name of the switch. Defaults to null.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The VPC ID.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a Switch resource.
type SwitchArgs struct {
	// The AZ for the switch.
	AvailabilityZone pulumi.StringInput
	// The CIDR block for the switch.
	CidrBlock pulumi.StringInput
	// The switch description. Defaults to null.
	Description pulumi.StringPtrInput
	// The name of the switch. Defaults to null.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The VPC ID.
	VpcId pulumi.StringInput
}

func (SwitchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchArgs)(nil)).Elem()
}

type SwitchInput interface {
	pulumi.Input

	ToSwitchOutput() SwitchOutput
	ToSwitchOutputWithContext(ctx context.Context) SwitchOutput
}

func (*Switch) ElementType() reflect.Type {
	return reflect.TypeOf((*Switch)(nil))
}

func (i *Switch) ToSwitchOutput() SwitchOutput {
	return i.ToSwitchOutputWithContext(context.Background())
}

func (i *Switch) ToSwitchOutputWithContext(ctx context.Context) SwitchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchOutput)
}

type SwitchOutput struct {
	*pulumi.OutputState
}

func (SwitchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Switch)(nil))
}

func (o SwitchOutput) ToSwitchOutput() SwitchOutput {
	return o
}

func (o SwitchOutput) ToSwitchOutputWithContext(ctx context.Context) SwitchOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SwitchOutput{})
}
