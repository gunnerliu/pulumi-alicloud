// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Bastion Host Account Share Key Attachment resource.
//
// For information about Bastion Host Host Account Share Key Attachment and how to use it, see [What is Host Account Share Key Attachment](https://www.alibabacloud.com/help/en/bastion-host/latest/attachhostaccountstohostsharekey).
//
// > **NOTE:** Available in v1.165.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tfacc_host_account_share_key_attachment"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultInstances, err := bastionhost.GetInstances(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultHostShareKey, err := bastionhost.NewHostShareKey(ctx, "defaultHostShareKey", &bastionhost.HostShareKeyArgs{
//				HostShareKeyName: pulumi.String("example_name"),
//				InstanceId:       *pulumi.String(defaultInstances.Instances[0].Id),
//				PassPhrase:       pulumi.String("example_value"),
//				PrivateKey:       pulumi.String("example_value"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultHost, err := bastionhost.NewHost(ctx, "defaultHost", &bastionhost.HostArgs{
//				InstanceId:         *pulumi.String(defaultInstances.Ids[0]),
//				HostName:           pulumi.String(name),
//				ActiveAddressType:  pulumi.String("Private"),
//				HostPrivateAddress: pulumi.String("172.16.0.10"),
//				OsType:             pulumi.String("Linux"),
//				Source:             pulumi.String("Local"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultHostAccount, err := bastionhost.NewHostAccount(ctx, "defaultHostAccount", &bastionhost.HostAccountArgs{
//				InstanceId:      *pulumi.String(defaultInstances.Ids[0]),
//				HostAccountName: pulumi.String(name),
//				HostId:          defaultHost.HostId,
//				ProtocolName:    pulumi.String("SSH"),
//				Password:        pulumi.String("YourPassword12345"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bastionhost.NewHostAccountShareKeyAttachment(ctx, "defaultHostAccountShareKeyAttachment", &bastionhost.HostAccountShareKeyAttachmentArgs{
//				InstanceId:     *pulumi.String(defaultInstances.Instances[0].Id),
//				HostShareKeyId: defaultHostShareKey.HostShareKeyId,
//				HostAccountId:  defaultHostAccount.HostAccountId,
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
// Bastion Host Account Share Key Attachment can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:bastionhost/hostAccountShareKeyAttachment:HostAccountShareKeyAttachment example <instance_id>:<host_share_key_id>:<host_account_id>
//
// ```
type HostAccountShareKeyAttachment struct {
	pulumi.CustomResourceState

	// The ID list of the host account.
	HostAccountId pulumi.StringOutput `pulumi:"hostAccountId"`
	// The ID of the host shared key.
	HostShareKeyId pulumi.StringOutput `pulumi:"hostShareKeyId"`
	// The ID of the Bastion machine instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
}

// NewHostAccountShareKeyAttachment registers a new resource with the given unique name, arguments, and options.
func NewHostAccountShareKeyAttachment(ctx *pulumi.Context,
	name string, args *HostAccountShareKeyAttachmentArgs, opts ...pulumi.ResourceOption) (*HostAccountShareKeyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HostAccountId == nil {
		return nil, errors.New("invalid value for required argument 'HostAccountId'")
	}
	if args.HostShareKeyId == nil {
		return nil, errors.New("invalid value for required argument 'HostShareKeyId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource HostAccountShareKeyAttachment
	err := ctx.RegisterResource("alicloud:bastionhost/hostAccountShareKeyAttachment:HostAccountShareKeyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostAccountShareKeyAttachment gets an existing HostAccountShareKeyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostAccountShareKeyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostAccountShareKeyAttachmentState, opts ...pulumi.ResourceOption) (*HostAccountShareKeyAttachment, error) {
	var resource HostAccountShareKeyAttachment
	err := ctx.ReadResource("alicloud:bastionhost/hostAccountShareKeyAttachment:HostAccountShareKeyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostAccountShareKeyAttachment resources.
type hostAccountShareKeyAttachmentState struct {
	// The ID list of the host account.
	HostAccountId *string `pulumi:"hostAccountId"`
	// The ID of the host shared key.
	HostShareKeyId *string `pulumi:"hostShareKeyId"`
	// The ID of the Bastion machine instance.
	InstanceId *string `pulumi:"instanceId"`
}

type HostAccountShareKeyAttachmentState struct {
	// The ID list of the host account.
	HostAccountId pulumi.StringPtrInput
	// The ID of the host shared key.
	HostShareKeyId pulumi.StringPtrInput
	// The ID of the Bastion machine instance.
	InstanceId pulumi.StringPtrInput
}

func (HostAccountShareKeyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostAccountShareKeyAttachmentState)(nil)).Elem()
}

type hostAccountShareKeyAttachmentArgs struct {
	// The ID list of the host account.
	HostAccountId string `pulumi:"hostAccountId"`
	// The ID of the host shared key.
	HostShareKeyId string `pulumi:"hostShareKeyId"`
	// The ID of the Bastion machine instance.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a HostAccountShareKeyAttachment resource.
type HostAccountShareKeyAttachmentArgs struct {
	// The ID list of the host account.
	HostAccountId pulumi.StringInput
	// The ID of the host shared key.
	HostShareKeyId pulumi.StringInput
	// The ID of the Bastion machine instance.
	InstanceId pulumi.StringInput
}

func (HostAccountShareKeyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostAccountShareKeyAttachmentArgs)(nil)).Elem()
}

type HostAccountShareKeyAttachmentInput interface {
	pulumi.Input

	ToHostAccountShareKeyAttachmentOutput() HostAccountShareKeyAttachmentOutput
	ToHostAccountShareKeyAttachmentOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentOutput
}

func (*HostAccountShareKeyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**HostAccountShareKeyAttachment)(nil)).Elem()
}

func (i *HostAccountShareKeyAttachment) ToHostAccountShareKeyAttachmentOutput() HostAccountShareKeyAttachmentOutput {
	return i.ToHostAccountShareKeyAttachmentOutputWithContext(context.Background())
}

func (i *HostAccountShareKeyAttachment) ToHostAccountShareKeyAttachmentOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountShareKeyAttachmentOutput)
}

// HostAccountShareKeyAttachmentArrayInput is an input type that accepts HostAccountShareKeyAttachmentArray and HostAccountShareKeyAttachmentArrayOutput values.
// You can construct a concrete instance of `HostAccountShareKeyAttachmentArrayInput` via:
//
//	HostAccountShareKeyAttachmentArray{ HostAccountShareKeyAttachmentArgs{...} }
type HostAccountShareKeyAttachmentArrayInput interface {
	pulumi.Input

	ToHostAccountShareKeyAttachmentArrayOutput() HostAccountShareKeyAttachmentArrayOutput
	ToHostAccountShareKeyAttachmentArrayOutputWithContext(context.Context) HostAccountShareKeyAttachmentArrayOutput
}

type HostAccountShareKeyAttachmentArray []HostAccountShareKeyAttachmentInput

func (HostAccountShareKeyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (i HostAccountShareKeyAttachmentArray) ToHostAccountShareKeyAttachmentArrayOutput() HostAccountShareKeyAttachmentArrayOutput {
	return i.ToHostAccountShareKeyAttachmentArrayOutputWithContext(context.Background())
}

func (i HostAccountShareKeyAttachmentArray) ToHostAccountShareKeyAttachmentArrayOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountShareKeyAttachmentArrayOutput)
}

// HostAccountShareKeyAttachmentMapInput is an input type that accepts HostAccountShareKeyAttachmentMap and HostAccountShareKeyAttachmentMapOutput values.
// You can construct a concrete instance of `HostAccountShareKeyAttachmentMapInput` via:
//
//	HostAccountShareKeyAttachmentMap{ "key": HostAccountShareKeyAttachmentArgs{...} }
type HostAccountShareKeyAttachmentMapInput interface {
	pulumi.Input

	ToHostAccountShareKeyAttachmentMapOutput() HostAccountShareKeyAttachmentMapOutput
	ToHostAccountShareKeyAttachmentMapOutputWithContext(context.Context) HostAccountShareKeyAttachmentMapOutput
}

type HostAccountShareKeyAttachmentMap map[string]HostAccountShareKeyAttachmentInput

func (HostAccountShareKeyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (i HostAccountShareKeyAttachmentMap) ToHostAccountShareKeyAttachmentMapOutput() HostAccountShareKeyAttachmentMapOutput {
	return i.ToHostAccountShareKeyAttachmentMapOutputWithContext(context.Background())
}

func (i HostAccountShareKeyAttachmentMap) ToHostAccountShareKeyAttachmentMapOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostAccountShareKeyAttachmentMapOutput)
}

type HostAccountShareKeyAttachmentOutput struct{ *pulumi.OutputState }

func (HostAccountShareKeyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostAccountShareKeyAttachment)(nil)).Elem()
}

func (o HostAccountShareKeyAttachmentOutput) ToHostAccountShareKeyAttachmentOutput() HostAccountShareKeyAttachmentOutput {
	return o
}

func (o HostAccountShareKeyAttachmentOutput) ToHostAccountShareKeyAttachmentOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentOutput {
	return o
}

// The ID list of the host account.
func (o HostAccountShareKeyAttachmentOutput) HostAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostAccountShareKeyAttachment) pulumi.StringOutput { return v.HostAccountId }).(pulumi.StringOutput)
}

// The ID of the host shared key.
func (o HostAccountShareKeyAttachmentOutput) HostShareKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostAccountShareKeyAttachment) pulumi.StringOutput { return v.HostShareKeyId }).(pulumi.StringOutput)
}

// The ID of the Bastion machine instance.
func (o HostAccountShareKeyAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostAccountShareKeyAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

type HostAccountShareKeyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (HostAccountShareKeyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (o HostAccountShareKeyAttachmentArrayOutput) ToHostAccountShareKeyAttachmentArrayOutput() HostAccountShareKeyAttachmentArrayOutput {
	return o
}

func (o HostAccountShareKeyAttachmentArrayOutput) ToHostAccountShareKeyAttachmentArrayOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentArrayOutput {
	return o
}

func (o HostAccountShareKeyAttachmentArrayOutput) Index(i pulumi.IntInput) HostAccountShareKeyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostAccountShareKeyAttachment {
		return vs[0].([]*HostAccountShareKeyAttachment)[vs[1].(int)]
	}).(HostAccountShareKeyAttachmentOutput)
}

type HostAccountShareKeyAttachmentMapOutput struct{ *pulumi.OutputState }

func (HostAccountShareKeyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostAccountShareKeyAttachment)(nil)).Elem()
}

func (o HostAccountShareKeyAttachmentMapOutput) ToHostAccountShareKeyAttachmentMapOutput() HostAccountShareKeyAttachmentMapOutput {
	return o
}

func (o HostAccountShareKeyAttachmentMapOutput) ToHostAccountShareKeyAttachmentMapOutputWithContext(ctx context.Context) HostAccountShareKeyAttachmentMapOutput {
	return o
}

func (o HostAccountShareKeyAttachmentMapOutput) MapIndex(k pulumi.StringInput) HostAccountShareKeyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostAccountShareKeyAttachment {
		return vs[0].(map[string]*HostAccountShareKeyAttachment)[vs[1].(string)]
	}).(HostAccountShareKeyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountShareKeyAttachmentInput)(nil)).Elem(), &HostAccountShareKeyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountShareKeyAttachmentArrayInput)(nil)).Elem(), HostAccountShareKeyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostAccountShareKeyAttachmentMapInput)(nil)).Elem(), HostAccountShareKeyAttachmentMap{})
	pulumi.RegisterOutputType(HostAccountShareKeyAttachmentOutput{})
	pulumi.RegisterOutputType(HostAccountShareKeyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(HostAccountShareKeyAttachmentMapOutput{})
}
