// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Express Connect Physical Connection resource.
//
// For information about Express Connect Physical Connection and how to use it, see [What is Physical Connection](https://www.alibabacloud.com/help/doc-detail/44852.htm).
//
// > **NOTE:** Available since v1.132.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := expressconnect.NewPhysicalConnection(ctx, "domestic", &expressconnect.PhysicalConnectionArgs{
//				AccessPointId:          pulumi.String("ap-cn-hangzhou-yh-B"),
//				Bandwidth:              pulumi.String("100"),
//				Description:            pulumi.String("my domestic connection"),
//				LineOperator:           pulumi.String("CT"),
//				PeerLocation:           pulumi.String("example_value"),
//				PhysicalConnectionName: pulumi.String("example_value"),
//				PortType:               pulumi.String("1000Base-LX"),
//				Type:                   pulumi.String("VPC"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = expressconnect.NewPhysicalConnection(ctx, "international", &expressconnect.PhysicalConnectionArgs{
//				AccessPointId:          pulumi.String("ap-sg-singpore-A"),
//				Bandwidth:              pulumi.String("100"),
//				Description:            pulumi.String("my domestic connection"),
//				LineOperator:           pulumi.String("Other"),
//				PeerLocation:           pulumi.String("example_value"),
//				PhysicalConnectionName: pulumi.String("example_value"),
//				PortType:               pulumi.String("1000Base-LX"),
//				Type:                   pulumi.String("VPC"),
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
// Express Connect Physical Connection can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:expressconnect/physicalConnection:PhysicalConnection example <id>
//
// ```
type PhysicalConnection struct {
	pulumi.CustomResourceState

	// The Physical Leased Line Access Point ID.
	AccessPointId pulumi.StringOutput `pulumi:"accessPointId"`
	// On the Bandwidth of the ECC Service and Physical Connection.
	Bandwidth pulumi.StringOutput `pulumi:"bandwidth"`
	// Operators for Physical Connection Circuit Provided Coding.
	CircuitCode pulumi.StringPtrOutput `pulumi:"circuitCode"`
	// The Physical Connection to Which the Description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Provides Access to the Physical Line Operator. Valid values:
	// * CT: China Telecom
	// * CU: China Unicom
	// * CM: china Mobile
	// * CO: Other Chinese
	// * Equinix: Equinix
	// * Other: Other Overseas.
	LineOperator pulumi.StringOutput `pulumi:"lineOperator"`
	// and an on-Premises Data Center Location.
	PeerLocation pulumi.StringPtrOutput `pulumi:"peerLocation"`
	// on Behalf of the Resource Name of the Resources-Attribute Field.
	PhysicalConnectionName pulumi.StringPtrOutput `pulumi:"physicalConnectionName"`
	// The Physical Leased Line Access Port Type. Valid value:
	// * 100Base-T: Fast Electrical Ports
	// * 1000Base-T: gigabit Electrical Ports
	// * 1000Base-LX: Gigabit Singlemode Optical Ports (10Km)
	// * 10GBase-T: Gigabit Electrical Port
	// * 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
	// * 40GBase-LR: 40 Gigabit Singlemode Optical Ports.
	// * 100GBase-LR: One hundred thousand Gigabit Singlemode Optical Ports.
	//
	// **NOTE:** From in v1.185.0+, The `40GBase-LR` and `100GBase-LR` is valid. and Set these values based on the water levels of background ports. For details about the water levels, contact the business manager.
	PortType pulumi.StringPtrOutput `pulumi:"portType"`
	// Redundant Physical Connection to Which the ID.
	RedundantPhysicalConnectionId pulumi.StringPtrOutput `pulumi:"redundantPhysicalConnectionId"`
	// Resources on Behalf of a State of the Resource Attribute Field. Valid values: `Canceled`, `Enabled`, `Terminated`.
	Status pulumi.StringOutput `pulumi:"status"`
	// Physical Private Line of Type. Default Value: VPC.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewPhysicalConnection registers a new resource with the given unique name, arguments, and options.
func NewPhysicalConnection(ctx *pulumi.Context,
	name string, args *PhysicalConnectionArgs, opts ...pulumi.ResourceOption) (*PhysicalConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessPointId == nil {
		return nil, errors.New("invalid value for required argument 'AccessPointId'")
	}
	if args.LineOperator == nil {
		return nil, errors.New("invalid value for required argument 'LineOperator'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PhysicalConnection
	err := ctx.RegisterResource("alicloud:expressconnect/physicalConnection:PhysicalConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPhysicalConnection gets an existing PhysicalConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPhysicalConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PhysicalConnectionState, opts ...pulumi.ResourceOption) (*PhysicalConnection, error) {
	var resource PhysicalConnection
	err := ctx.ReadResource("alicloud:expressconnect/physicalConnection:PhysicalConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PhysicalConnection resources.
type physicalConnectionState struct {
	// The Physical Leased Line Access Point ID.
	AccessPointId *string `pulumi:"accessPointId"`
	// On the Bandwidth of the ECC Service and Physical Connection.
	Bandwidth *string `pulumi:"bandwidth"`
	// Operators for Physical Connection Circuit Provided Coding.
	CircuitCode *string `pulumi:"circuitCode"`
	// The Physical Connection to Which the Description.
	Description *string `pulumi:"description"`
	// Provides Access to the Physical Line Operator. Valid values:
	// * CT: China Telecom
	// * CU: China Unicom
	// * CM: china Mobile
	// * CO: Other Chinese
	// * Equinix: Equinix
	// * Other: Other Overseas.
	LineOperator *string `pulumi:"lineOperator"`
	// and an on-Premises Data Center Location.
	PeerLocation *string `pulumi:"peerLocation"`
	// on Behalf of the Resource Name of the Resources-Attribute Field.
	PhysicalConnectionName *string `pulumi:"physicalConnectionName"`
	// The Physical Leased Line Access Port Type. Valid value:
	// * 100Base-T: Fast Electrical Ports
	// * 1000Base-T: gigabit Electrical Ports
	// * 1000Base-LX: Gigabit Singlemode Optical Ports (10Km)
	// * 10GBase-T: Gigabit Electrical Port
	// * 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
	// * 40GBase-LR: 40 Gigabit Singlemode Optical Ports.
	// * 100GBase-LR: One hundred thousand Gigabit Singlemode Optical Ports.
	//
	// **NOTE:** From in v1.185.0+, The `40GBase-LR` and `100GBase-LR` is valid. and Set these values based on the water levels of background ports. For details about the water levels, contact the business manager.
	PortType *string `pulumi:"portType"`
	// Redundant Physical Connection to Which the ID.
	RedundantPhysicalConnectionId *string `pulumi:"redundantPhysicalConnectionId"`
	// Resources on Behalf of a State of the Resource Attribute Field. Valid values: `Canceled`, `Enabled`, `Terminated`.
	Status *string `pulumi:"status"`
	// Physical Private Line of Type. Default Value: VPC.
	Type *string `pulumi:"type"`
}

type PhysicalConnectionState struct {
	// The Physical Leased Line Access Point ID.
	AccessPointId pulumi.StringPtrInput
	// On the Bandwidth of the ECC Service and Physical Connection.
	Bandwidth pulumi.StringPtrInput
	// Operators for Physical Connection Circuit Provided Coding.
	CircuitCode pulumi.StringPtrInput
	// The Physical Connection to Which the Description.
	Description pulumi.StringPtrInput
	// Provides Access to the Physical Line Operator. Valid values:
	// * CT: China Telecom
	// * CU: China Unicom
	// * CM: china Mobile
	// * CO: Other Chinese
	// * Equinix: Equinix
	// * Other: Other Overseas.
	LineOperator pulumi.StringPtrInput
	// and an on-Premises Data Center Location.
	PeerLocation pulumi.StringPtrInput
	// on Behalf of the Resource Name of the Resources-Attribute Field.
	PhysicalConnectionName pulumi.StringPtrInput
	// The Physical Leased Line Access Port Type. Valid value:
	// * 100Base-T: Fast Electrical Ports
	// * 1000Base-T: gigabit Electrical Ports
	// * 1000Base-LX: Gigabit Singlemode Optical Ports (10Km)
	// * 10GBase-T: Gigabit Electrical Port
	// * 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
	// * 40GBase-LR: 40 Gigabit Singlemode Optical Ports.
	// * 100GBase-LR: One hundred thousand Gigabit Singlemode Optical Ports.
	//
	// **NOTE:** From in v1.185.0+, The `40GBase-LR` and `100GBase-LR` is valid. and Set these values based on the water levels of background ports. For details about the water levels, contact the business manager.
	PortType pulumi.StringPtrInput
	// Redundant Physical Connection to Which the ID.
	RedundantPhysicalConnectionId pulumi.StringPtrInput
	// Resources on Behalf of a State of the Resource Attribute Field. Valid values: `Canceled`, `Enabled`, `Terminated`.
	Status pulumi.StringPtrInput
	// Physical Private Line of Type. Default Value: VPC.
	Type pulumi.StringPtrInput
}

func (PhysicalConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*physicalConnectionState)(nil)).Elem()
}

type physicalConnectionArgs struct {
	// The Physical Leased Line Access Point ID.
	AccessPointId string `pulumi:"accessPointId"`
	// On the Bandwidth of the ECC Service and Physical Connection.
	Bandwidth *string `pulumi:"bandwidth"`
	// Operators for Physical Connection Circuit Provided Coding.
	CircuitCode *string `pulumi:"circuitCode"`
	// The Physical Connection to Which the Description.
	Description *string `pulumi:"description"`
	// Provides Access to the Physical Line Operator. Valid values:
	// * CT: China Telecom
	// * CU: China Unicom
	// * CM: china Mobile
	// * CO: Other Chinese
	// * Equinix: Equinix
	// * Other: Other Overseas.
	LineOperator string `pulumi:"lineOperator"`
	// and an on-Premises Data Center Location.
	PeerLocation *string `pulumi:"peerLocation"`
	// on Behalf of the Resource Name of the Resources-Attribute Field.
	PhysicalConnectionName *string `pulumi:"physicalConnectionName"`
	// The Physical Leased Line Access Port Type. Valid value:
	// * 100Base-T: Fast Electrical Ports
	// * 1000Base-T: gigabit Electrical Ports
	// * 1000Base-LX: Gigabit Singlemode Optical Ports (10Km)
	// * 10GBase-T: Gigabit Electrical Port
	// * 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
	// * 40GBase-LR: 40 Gigabit Singlemode Optical Ports.
	// * 100GBase-LR: One hundred thousand Gigabit Singlemode Optical Ports.
	//
	// **NOTE:** From in v1.185.0+, The `40GBase-LR` and `100GBase-LR` is valid. and Set these values based on the water levels of background ports. For details about the water levels, contact the business manager.
	PortType *string `pulumi:"portType"`
	// Redundant Physical Connection to Which the ID.
	RedundantPhysicalConnectionId *string `pulumi:"redundantPhysicalConnectionId"`
	// Resources on Behalf of a State of the Resource Attribute Field. Valid values: `Canceled`, `Enabled`, `Terminated`.
	Status *string `pulumi:"status"`
	// Physical Private Line of Type. Default Value: VPC.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a PhysicalConnection resource.
type PhysicalConnectionArgs struct {
	// The Physical Leased Line Access Point ID.
	AccessPointId pulumi.StringInput
	// On the Bandwidth of the ECC Service and Physical Connection.
	Bandwidth pulumi.StringPtrInput
	// Operators for Physical Connection Circuit Provided Coding.
	CircuitCode pulumi.StringPtrInput
	// The Physical Connection to Which the Description.
	Description pulumi.StringPtrInput
	// Provides Access to the Physical Line Operator. Valid values:
	// * CT: China Telecom
	// * CU: China Unicom
	// * CM: china Mobile
	// * CO: Other Chinese
	// * Equinix: Equinix
	// * Other: Other Overseas.
	LineOperator pulumi.StringInput
	// and an on-Premises Data Center Location.
	PeerLocation pulumi.StringPtrInput
	// on Behalf of the Resource Name of the Resources-Attribute Field.
	PhysicalConnectionName pulumi.StringPtrInput
	// The Physical Leased Line Access Port Type. Valid value:
	// * 100Base-T: Fast Electrical Ports
	// * 1000Base-T: gigabit Electrical Ports
	// * 1000Base-LX: Gigabit Singlemode Optical Ports (10Km)
	// * 10GBase-T: Gigabit Electrical Port
	// * 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
	// * 40GBase-LR: 40 Gigabit Singlemode Optical Ports.
	// * 100GBase-LR: One hundred thousand Gigabit Singlemode Optical Ports.
	//
	// **NOTE:** From in v1.185.0+, The `40GBase-LR` and `100GBase-LR` is valid. and Set these values based on the water levels of background ports. For details about the water levels, contact the business manager.
	PortType pulumi.StringPtrInput
	// Redundant Physical Connection to Which the ID.
	RedundantPhysicalConnectionId pulumi.StringPtrInput
	// Resources on Behalf of a State of the Resource Attribute Field. Valid values: `Canceled`, `Enabled`, `Terminated`.
	Status pulumi.StringPtrInput
	// Physical Private Line of Type. Default Value: VPC.
	Type pulumi.StringPtrInput
}

func (PhysicalConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*physicalConnectionArgs)(nil)).Elem()
}

type PhysicalConnectionInput interface {
	pulumi.Input

	ToPhysicalConnectionOutput() PhysicalConnectionOutput
	ToPhysicalConnectionOutputWithContext(ctx context.Context) PhysicalConnectionOutput
}

func (*PhysicalConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**PhysicalConnection)(nil)).Elem()
}

func (i *PhysicalConnection) ToPhysicalConnectionOutput() PhysicalConnectionOutput {
	return i.ToPhysicalConnectionOutputWithContext(context.Background())
}

func (i *PhysicalConnection) ToPhysicalConnectionOutputWithContext(ctx context.Context) PhysicalConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PhysicalConnectionOutput)
}

func (i *PhysicalConnection) ToOutput(ctx context.Context) pulumix.Output[*PhysicalConnection] {
	return pulumix.Output[*PhysicalConnection]{
		OutputState: i.ToPhysicalConnectionOutputWithContext(ctx).OutputState,
	}
}

// PhysicalConnectionArrayInput is an input type that accepts PhysicalConnectionArray and PhysicalConnectionArrayOutput values.
// You can construct a concrete instance of `PhysicalConnectionArrayInput` via:
//
//	PhysicalConnectionArray{ PhysicalConnectionArgs{...} }
type PhysicalConnectionArrayInput interface {
	pulumi.Input

	ToPhysicalConnectionArrayOutput() PhysicalConnectionArrayOutput
	ToPhysicalConnectionArrayOutputWithContext(context.Context) PhysicalConnectionArrayOutput
}

type PhysicalConnectionArray []PhysicalConnectionInput

func (PhysicalConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PhysicalConnection)(nil)).Elem()
}

func (i PhysicalConnectionArray) ToPhysicalConnectionArrayOutput() PhysicalConnectionArrayOutput {
	return i.ToPhysicalConnectionArrayOutputWithContext(context.Background())
}

func (i PhysicalConnectionArray) ToPhysicalConnectionArrayOutputWithContext(ctx context.Context) PhysicalConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PhysicalConnectionArrayOutput)
}

func (i PhysicalConnectionArray) ToOutput(ctx context.Context) pulumix.Output[[]*PhysicalConnection] {
	return pulumix.Output[[]*PhysicalConnection]{
		OutputState: i.ToPhysicalConnectionArrayOutputWithContext(ctx).OutputState,
	}
}

// PhysicalConnectionMapInput is an input type that accepts PhysicalConnectionMap and PhysicalConnectionMapOutput values.
// You can construct a concrete instance of `PhysicalConnectionMapInput` via:
//
//	PhysicalConnectionMap{ "key": PhysicalConnectionArgs{...} }
type PhysicalConnectionMapInput interface {
	pulumi.Input

	ToPhysicalConnectionMapOutput() PhysicalConnectionMapOutput
	ToPhysicalConnectionMapOutputWithContext(context.Context) PhysicalConnectionMapOutput
}

type PhysicalConnectionMap map[string]PhysicalConnectionInput

func (PhysicalConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PhysicalConnection)(nil)).Elem()
}

func (i PhysicalConnectionMap) ToPhysicalConnectionMapOutput() PhysicalConnectionMapOutput {
	return i.ToPhysicalConnectionMapOutputWithContext(context.Background())
}

func (i PhysicalConnectionMap) ToPhysicalConnectionMapOutputWithContext(ctx context.Context) PhysicalConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PhysicalConnectionMapOutput)
}

func (i PhysicalConnectionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*PhysicalConnection] {
	return pulumix.Output[map[string]*PhysicalConnection]{
		OutputState: i.ToPhysicalConnectionMapOutputWithContext(ctx).OutputState,
	}
}

type PhysicalConnectionOutput struct{ *pulumi.OutputState }

func (PhysicalConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PhysicalConnection)(nil)).Elem()
}

func (o PhysicalConnectionOutput) ToPhysicalConnectionOutput() PhysicalConnectionOutput {
	return o
}

func (o PhysicalConnectionOutput) ToPhysicalConnectionOutputWithContext(ctx context.Context) PhysicalConnectionOutput {
	return o
}

func (o PhysicalConnectionOutput) ToOutput(ctx context.Context) pulumix.Output[*PhysicalConnection] {
	return pulumix.Output[*PhysicalConnection]{
		OutputState: o.OutputState,
	}
}

// The Physical Leased Line Access Point ID.
func (o PhysicalConnectionOutput) AccessPointId() pulumi.StringOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringOutput { return v.AccessPointId }).(pulumi.StringOutput)
}

// On the Bandwidth of the ECC Service and Physical Connection.
func (o PhysicalConnectionOutput) Bandwidth() pulumi.StringOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringOutput { return v.Bandwidth }).(pulumi.StringOutput)
}

// Operators for Physical Connection Circuit Provided Coding.
func (o PhysicalConnectionOutput) CircuitCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringPtrOutput { return v.CircuitCode }).(pulumi.StringPtrOutput)
}

// The Physical Connection to Which the Description.
func (o PhysicalConnectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Provides Access to the Physical Line Operator. Valid values:
// * CT: China Telecom
// * CU: China Unicom
// * CM: china Mobile
// * CO: Other Chinese
// * Equinix: Equinix
// * Other: Other Overseas.
func (o PhysicalConnectionOutput) LineOperator() pulumi.StringOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringOutput { return v.LineOperator }).(pulumi.StringOutput)
}

// and an on-Premises Data Center Location.
func (o PhysicalConnectionOutput) PeerLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringPtrOutput { return v.PeerLocation }).(pulumi.StringPtrOutput)
}

// on Behalf of the Resource Name of the Resources-Attribute Field.
func (o PhysicalConnectionOutput) PhysicalConnectionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringPtrOutput { return v.PhysicalConnectionName }).(pulumi.StringPtrOutput)
}

// The Physical Leased Line Access Port Type. Valid value:
// * 100Base-T: Fast Electrical Ports
// * 1000Base-T: gigabit Electrical Ports
// * 1000Base-LX: Gigabit Singlemode Optical Ports (10Km)
// * 10GBase-T: Gigabit Electrical Port
// * 10GBase-LR: Gigabit Singlemode Optical Ports (10Km).
// * 40GBase-LR: 40 Gigabit Singlemode Optical Ports.
// * 100GBase-LR: One hundred thousand Gigabit Singlemode Optical Ports.
//
// **NOTE:** From in v1.185.0+, The `40GBase-LR` and `100GBase-LR` is valid. and Set these values based on the water levels of background ports. For details about the water levels, contact the business manager.
func (o PhysicalConnectionOutput) PortType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringPtrOutput { return v.PortType }).(pulumi.StringPtrOutput)
}

// Redundant Physical Connection to Which the ID.
func (o PhysicalConnectionOutput) RedundantPhysicalConnectionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringPtrOutput { return v.RedundantPhysicalConnectionId }).(pulumi.StringPtrOutput)
}

// Resources on Behalf of a State of the Resource Attribute Field. Valid values: `Canceled`, `Enabled`, `Terminated`.
func (o PhysicalConnectionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Physical Private Line of Type. Default Value: VPC.
func (o PhysicalConnectionOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PhysicalConnection) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type PhysicalConnectionArrayOutput struct{ *pulumi.OutputState }

func (PhysicalConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PhysicalConnection)(nil)).Elem()
}

func (o PhysicalConnectionArrayOutput) ToPhysicalConnectionArrayOutput() PhysicalConnectionArrayOutput {
	return o
}

func (o PhysicalConnectionArrayOutput) ToPhysicalConnectionArrayOutputWithContext(ctx context.Context) PhysicalConnectionArrayOutput {
	return o
}

func (o PhysicalConnectionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*PhysicalConnection] {
	return pulumix.Output[[]*PhysicalConnection]{
		OutputState: o.OutputState,
	}
}

func (o PhysicalConnectionArrayOutput) Index(i pulumi.IntInput) PhysicalConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PhysicalConnection {
		return vs[0].([]*PhysicalConnection)[vs[1].(int)]
	}).(PhysicalConnectionOutput)
}

type PhysicalConnectionMapOutput struct{ *pulumi.OutputState }

func (PhysicalConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PhysicalConnection)(nil)).Elem()
}

func (o PhysicalConnectionMapOutput) ToPhysicalConnectionMapOutput() PhysicalConnectionMapOutput {
	return o
}

func (o PhysicalConnectionMapOutput) ToPhysicalConnectionMapOutputWithContext(ctx context.Context) PhysicalConnectionMapOutput {
	return o
}

func (o PhysicalConnectionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*PhysicalConnection] {
	return pulumix.Output[map[string]*PhysicalConnection]{
		OutputState: o.OutputState,
	}
}

func (o PhysicalConnectionMapOutput) MapIndex(k pulumi.StringInput) PhysicalConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PhysicalConnection {
		return vs[0].(map[string]*PhysicalConnection)[vs[1].(string)]
	}).(PhysicalConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PhysicalConnectionInput)(nil)).Elem(), &PhysicalConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*PhysicalConnectionArrayInput)(nil)).Elem(), PhysicalConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PhysicalConnectionMapInput)(nil)).Elem(), PhysicalConnectionMap{})
	pulumi.RegisterOutputType(PhysicalConnectionOutput{})
	pulumi.RegisterOutputType(PhysicalConnectionArrayOutput{})
	pulumi.RegisterOutputType(PhysicalConnectionMapOutput{})
}
