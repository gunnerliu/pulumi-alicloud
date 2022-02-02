// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECD Command resource.
//
// For information about ECD Command and how to use it, see [What is Command](https://help.aliyun.com/document_detail/188382.html).
//
// > **NOTE:** Available in v1.146.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eds"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultSimpleOfficeSite, err := eds.NewSimpleOfficeSite(ctx, "defaultSimpleOfficeSite", &eds.SimpleOfficeSiteArgs{
// 			CidrBlock:         pulumi.String("172.16.0.0/12"),
// 			DesktopAccessType: pulumi.String("Internet"),
// 			OfficeSiteName:    pulumi.String("your_office_site_name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "SYSTEM"
// 		opt1 := "windows"
// 		defaultBundles, err := eds.GetBundles(ctx, &eds.GetBundlesArgs{
// 			BundleType: &opt0,
// 			NameRegex:  &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultEcdPolicyGroup, err := eds.NewEcdPolicyGroup(ctx, "defaultEcdPolicyGroup", &eds.EcdPolicyGroupArgs{
// 			PolicyGroupName: pulumi.String("your_policy_group_name"),
// 			Clipboard:       pulumi.String("readwrite"),
// 			LocalDrive:      pulumi.String("read"),
// 			AuthorizeAccessPolicyRules: eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArray{
// 				&eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs{
// 					Description: pulumi.String("example_value"),
// 					CidrIp:      pulumi.String("1.2.3.4/24"),
// 				},
// 			},
// 			AuthorizeSecurityPolicyRules: eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArray{
// 				&eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs{
// 					Type:        pulumi.String("inflow"),
// 					Policy:      pulumi.String("accept"),
// 					Description: pulumi.String("example_value"),
// 					PortRange:   pulumi.String("80/80"),
// 					IpProtocol:  pulumi.String("TCP"),
// 					Priority:    pulumi.String("1"),
// 					CidrIp:      pulumi.String("0.0.0.0/0"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultDesktop, err := eds.NewDesktop(ctx, "defaultDesktop", &eds.DesktopArgs{
// 			OfficeSiteId:  defaultSimpleOfficeSite.ID(),
// 			PolicyGroupId: defaultEcdPolicyGroup.ID(),
// 			BundleId:      pulumi.String(defaultBundles.Bundles[0].Id),
// 			DesktopName:   pulumi.Any(_var.Name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = eds.NewCommand(ctx, "defaultCommand", &eds.CommandArgs{
// 			CommandContent: pulumi.String("ipconfig"),
// 			CommandType:    pulumi.String("RunPowerShellScript"),
// 			DesktopId:      defaultDesktop.ID(),
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
// ECD Command can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:eds/command:Command example <id>
// ```
type Command struct {
	pulumi.CustomResourceState

	// The Contents of the Script to Base64 Encoded Transmission.
	CommandContent pulumi.StringOutput `pulumi:"commandContent"`
	// The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
	CommandType pulumi.StringOutput `pulumi:"commandType"`
	// That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
	ContentEncoding pulumi.StringPtrOutput `pulumi:"contentEncoding"`
	// The desktop id of the Desktop.
	DesktopId pulumi.StringOutput `pulumi:"desktopId"`
	// Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The timeout period for script execution the unit is seconds. Default to: `60`.
	Timeout pulumi.StringPtrOutput `pulumi:"timeout"`
}

// NewCommand registers a new resource with the given unique name, arguments, and options.
func NewCommand(ctx *pulumi.Context,
	name string, args *CommandArgs, opts ...pulumi.ResourceOption) (*Command, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CommandContent == nil {
		return nil, errors.New("invalid value for required argument 'CommandContent'")
	}
	if args.CommandType == nil {
		return nil, errors.New("invalid value for required argument 'CommandType'")
	}
	if args.DesktopId == nil {
		return nil, errors.New("invalid value for required argument 'DesktopId'")
	}
	var resource Command
	err := ctx.RegisterResource("alicloud:eds/command:Command", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCommand gets an existing Command resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCommand(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CommandState, opts ...pulumi.ResourceOption) (*Command, error) {
	var resource Command
	err := ctx.ReadResource("alicloud:eds/command:Command", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Command resources.
type commandState struct {
	// The Contents of the Script to Base64 Encoded Transmission.
	CommandContent *string `pulumi:"commandContent"`
	// The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
	CommandType *string `pulumi:"commandType"`
	// That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The desktop id of the Desktop.
	DesktopId *string `pulumi:"desktopId"`
	// Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
	Status *string `pulumi:"status"`
	// The timeout period for script execution the unit is seconds. Default to: `60`.
	Timeout *string `pulumi:"timeout"`
}

type CommandState struct {
	// The Contents of the Script to Base64 Encoded Transmission.
	CommandContent pulumi.StringPtrInput
	// The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
	CommandType pulumi.StringPtrInput
	// That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
	ContentEncoding pulumi.StringPtrInput
	// The desktop id of the Desktop.
	DesktopId pulumi.StringPtrInput
	// Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
	Status pulumi.StringPtrInput
	// The timeout period for script execution the unit is seconds. Default to: `60`.
	Timeout pulumi.StringPtrInput
}

func (CommandState) ElementType() reflect.Type {
	return reflect.TypeOf((*commandState)(nil)).Elem()
}

type commandArgs struct {
	// The Contents of the Script to Base64 Encoded Transmission.
	CommandContent string `pulumi:"commandContent"`
	// The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
	CommandType string `pulumi:"commandType"`
	// That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The desktop id of the Desktop.
	DesktopId string `pulumi:"desktopId"`
	// The timeout period for script execution the unit is seconds. Default to: `60`.
	Timeout *string `pulumi:"timeout"`
}

// The set of arguments for constructing a Command resource.
type CommandArgs struct {
	// The Contents of the Script to Base64 Encoded Transmission.
	CommandContent pulumi.StringInput
	// The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
	CommandType pulumi.StringInput
	// That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
	ContentEncoding pulumi.StringPtrInput
	// The desktop id of the Desktop.
	DesktopId pulumi.StringInput
	// The timeout period for script execution the unit is seconds. Default to: `60`.
	Timeout pulumi.StringPtrInput
}

func (CommandArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*commandArgs)(nil)).Elem()
}

type CommandInput interface {
	pulumi.Input

	ToCommandOutput() CommandOutput
	ToCommandOutputWithContext(ctx context.Context) CommandOutput
}

func (*Command) ElementType() reflect.Type {
	return reflect.TypeOf((**Command)(nil)).Elem()
}

func (i *Command) ToCommandOutput() CommandOutput {
	return i.ToCommandOutputWithContext(context.Background())
}

func (i *Command) ToCommandOutputWithContext(ctx context.Context) CommandOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CommandOutput)
}

// CommandArrayInput is an input type that accepts CommandArray and CommandArrayOutput values.
// You can construct a concrete instance of `CommandArrayInput` via:
//
//          CommandArray{ CommandArgs{...} }
type CommandArrayInput interface {
	pulumi.Input

	ToCommandArrayOutput() CommandArrayOutput
	ToCommandArrayOutputWithContext(context.Context) CommandArrayOutput
}

type CommandArray []CommandInput

func (CommandArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Command)(nil)).Elem()
}

func (i CommandArray) ToCommandArrayOutput() CommandArrayOutput {
	return i.ToCommandArrayOutputWithContext(context.Background())
}

func (i CommandArray) ToCommandArrayOutputWithContext(ctx context.Context) CommandArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CommandArrayOutput)
}

// CommandMapInput is an input type that accepts CommandMap and CommandMapOutput values.
// You can construct a concrete instance of `CommandMapInput` via:
//
//          CommandMap{ "key": CommandArgs{...} }
type CommandMapInput interface {
	pulumi.Input

	ToCommandMapOutput() CommandMapOutput
	ToCommandMapOutputWithContext(context.Context) CommandMapOutput
}

type CommandMap map[string]CommandInput

func (CommandMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Command)(nil)).Elem()
}

func (i CommandMap) ToCommandMapOutput() CommandMapOutput {
	return i.ToCommandMapOutputWithContext(context.Background())
}

func (i CommandMap) ToCommandMapOutputWithContext(ctx context.Context) CommandMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CommandMapOutput)
}

type CommandOutput struct{ *pulumi.OutputState }

func (CommandOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Command)(nil)).Elem()
}

func (o CommandOutput) ToCommandOutput() CommandOutput {
	return o
}

func (o CommandOutput) ToCommandOutputWithContext(ctx context.Context) CommandOutput {
	return o
}

type CommandArrayOutput struct{ *pulumi.OutputState }

func (CommandArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Command)(nil)).Elem()
}

func (o CommandArrayOutput) ToCommandArrayOutput() CommandArrayOutput {
	return o
}

func (o CommandArrayOutput) ToCommandArrayOutputWithContext(ctx context.Context) CommandArrayOutput {
	return o
}

func (o CommandArrayOutput) Index(i pulumi.IntInput) CommandOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Command {
		return vs[0].([]*Command)[vs[1].(int)]
	}).(CommandOutput)
}

type CommandMapOutput struct{ *pulumi.OutputState }

func (CommandMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Command)(nil)).Elem()
}

func (o CommandMapOutput) ToCommandMapOutput() CommandMapOutput {
	return o
}

func (o CommandMapOutput) ToCommandMapOutputWithContext(ctx context.Context) CommandMapOutput {
	return o
}

func (o CommandMapOutput) MapIndex(k pulumi.StringInput) CommandOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Command {
		return vs[0].(map[string]*Command)[vs[1].(string)]
	}).(CommandOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CommandInput)(nil)).Elem(), &Command{})
	pulumi.RegisterInputType(reflect.TypeOf((*CommandArrayInput)(nil)).Elem(), CommandArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CommandMapInput)(nil)).Elem(), CommandMap{})
	pulumi.RegisterOutputType(CommandOutput{})
	pulumi.RegisterOutputType(CommandArrayOutput{})
	pulumi.RegisterOutputType(CommandMapOutput{})
}
