/**
 * Autogenerated by Thrift Compiler (0.9.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mamehub.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerState implements org.apache.thrift.TBase<ServerState, ServerState._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServerState");

  private static final org.apache.thrift.protocol.TField LOGGED_IN_PLAYERS_FIELD_DESC = new org.apache.thrift.protocol.TField("loggedInPlayers", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField GAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("games", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServerStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServerStateTupleSchemeFactory());
  }

  public Map<String,Player> loggedInPlayers; // required
  public Map<String,Game> games; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOGGED_IN_PLAYERS((short)1, "loggedInPlayers"),
    GAMES((short)2, "games");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOGGED_IN_PLAYERS
          return LOGGED_IN_PLAYERS;
        case 2: // GAMES
          return GAMES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOGGED_IN_PLAYERS, new org.apache.thrift.meta_data.FieldMetaData("loggedInPlayers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Player.class))));
    tmpMap.put(_Fields.GAMES, new org.apache.thrift.meta_data.FieldMetaData("games", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Game.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServerState.class, metaDataMap);
  }

  public ServerState() {
  }

  public ServerState(
    Map<String,Player> loggedInPlayers,
    Map<String,Game> games)
  {
    this();
    this.loggedInPlayers = loggedInPlayers;
    this.games = games;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServerState(ServerState other) {
    if (other.isSetLoggedInPlayers()) {
      Map<String,Player> __this__loggedInPlayers = new HashMap<String,Player>();
      for (Map.Entry<String, Player> other_element : other.loggedInPlayers.entrySet()) {

        String other_element_key = other_element.getKey();
        Player other_element_value = other_element.getValue();

        String __this__loggedInPlayers_copy_key = other_element_key;

        Player __this__loggedInPlayers_copy_value = new Player(other_element_value);

        __this__loggedInPlayers.put(__this__loggedInPlayers_copy_key, __this__loggedInPlayers_copy_value);
      }
      this.loggedInPlayers = __this__loggedInPlayers;
    }
    if (other.isSetGames()) {
      Map<String,Game> __this__games = new HashMap<String,Game>();
      for (Map.Entry<String, Game> other_element : other.games.entrySet()) {

        String other_element_key = other_element.getKey();
        Game other_element_value = other_element.getValue();

        String __this__games_copy_key = other_element_key;

        Game __this__games_copy_value = new Game(other_element_value);

        __this__games.put(__this__games_copy_key, __this__games_copy_value);
      }
      this.games = __this__games;
    }
  }

  public ServerState deepCopy() {
    return new ServerState(this);
  }

  @Override
  public void clear() {
    this.loggedInPlayers = null;
    this.games = null;
  }

  public int getLoggedInPlayersSize() {
    return (this.loggedInPlayers == null) ? 0 : this.loggedInPlayers.size();
  }

  public void putToLoggedInPlayers(String key, Player val) {
    if (this.loggedInPlayers == null) {
      this.loggedInPlayers = new HashMap<String,Player>();
    }
    this.loggedInPlayers.put(key, val);
  }

  public Map<String,Player> getLoggedInPlayers() {
    return this.loggedInPlayers;
  }

  public ServerState setLoggedInPlayers(Map<String,Player> loggedInPlayers) {
    this.loggedInPlayers = loggedInPlayers;
    return this;
  }

  public void unsetLoggedInPlayers() {
    this.loggedInPlayers = null;
  }

  /** Returns true if field loggedInPlayers is set (has been assigned a value) and false otherwise */
  public boolean isSetLoggedInPlayers() {
    return this.loggedInPlayers != null;
  }

  public void setLoggedInPlayersIsSet(boolean value) {
    if (!value) {
      this.loggedInPlayers = null;
    }
  }

  public int getGamesSize() {
    return (this.games == null) ? 0 : this.games.size();
  }

  public void putToGames(String key, Game val) {
    if (this.games == null) {
      this.games = new HashMap<String,Game>();
    }
    this.games.put(key, val);
  }

  public Map<String,Game> getGames() {
    return this.games;
  }

  public ServerState setGames(Map<String,Game> games) {
    this.games = games;
    return this;
  }

  public void unsetGames() {
    this.games = null;
  }

  /** Returns true if field games is set (has been assigned a value) and false otherwise */
  public boolean isSetGames() {
    return this.games != null;
  }

  public void setGamesIsSet(boolean value) {
    if (!value) {
      this.games = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOGGED_IN_PLAYERS:
      if (value == null) {
        unsetLoggedInPlayers();
      } else {
        setLoggedInPlayers((Map<String,Player>)value);
      }
      break;

    case GAMES:
      if (value == null) {
        unsetGames();
      } else {
        setGames((Map<String,Game>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOGGED_IN_PLAYERS:
      return getLoggedInPlayers();

    case GAMES:
      return getGames();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOGGED_IN_PLAYERS:
      return isSetLoggedInPlayers();
    case GAMES:
      return isSetGames();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServerState)
      return this.equals((ServerState)that);
    return false;
  }

  public boolean equals(ServerState that) {
    if (that == null)
      return false;

    boolean this_present_loggedInPlayers = true && this.isSetLoggedInPlayers();
    boolean that_present_loggedInPlayers = true && that.isSetLoggedInPlayers();
    if (this_present_loggedInPlayers || that_present_loggedInPlayers) {
      if (!(this_present_loggedInPlayers && that_present_loggedInPlayers))
        return false;
      if (!this.loggedInPlayers.equals(that.loggedInPlayers))
        return false;
    }

    boolean this_present_games = true && this.isSetGames();
    boolean that_present_games = true && that.isSetGames();
    if (this_present_games || that_present_games) {
      if (!(this_present_games && that_present_games))
        return false;
      if (!this.games.equals(that.games))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ServerState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ServerState typedOther = (ServerState)other;

    lastComparison = Boolean.valueOf(isSetLoggedInPlayers()).compareTo(typedOther.isSetLoggedInPlayers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoggedInPlayers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loggedInPlayers, typedOther.loggedInPlayers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGames()).compareTo(typedOther.isSetGames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.games, typedOther.games);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServerState(");
    boolean first = true;

    sb.append("loggedInPlayers:");
    if (this.loggedInPlayers == null) {
      sb.append("null");
    } else {
      sb.append(this.loggedInPlayers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("games:");
    if (this.games == null) {
      sb.append("null");
    } else {
      sb.append(this.games);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ServerStateStandardSchemeFactory implements SchemeFactory {
    public ServerStateStandardScheme getScheme() {
      return new ServerStateStandardScheme();
    }
  }

  private static class ServerStateStandardScheme extends StandardScheme<ServerState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServerState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOGGED_IN_PLAYERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map46 = iprot.readMapBegin();
                struct.loggedInPlayers = new HashMap<String,Player>(2*_map46.size);
                for (int _i47 = 0; _i47 < _map46.size; ++_i47)
                {
                  String _key48; // required
                  Player _val49; // required
                  _key48 = iprot.readString();
                  _val49 = new Player();
                  _val49.read(iprot);
                  struct.loggedInPlayers.put(_key48, _val49);
                }
                iprot.readMapEnd();
              }
              struct.setLoggedInPlayersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map50 = iprot.readMapBegin();
                struct.games = new HashMap<String,Game>(2*_map50.size);
                for (int _i51 = 0; _i51 < _map50.size; ++_i51)
                {
                  String _key52; // required
                  Game _val53; // required
                  _key52 = iprot.readString();
                  _val53 = new Game();
                  _val53.read(iprot);
                  struct.games.put(_key52, _val53);
                }
                iprot.readMapEnd();
              }
              struct.setGamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServerState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.loggedInPlayers != null) {
        oprot.writeFieldBegin(LOGGED_IN_PLAYERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.loggedInPlayers.size()));
          for (Map.Entry<String, Player> _iter54 : struct.loggedInPlayers.entrySet())
          {
            oprot.writeString(_iter54.getKey());
            _iter54.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.games != null) {
        oprot.writeFieldBegin(GAMES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.games.size()));
          for (Map.Entry<String, Game> _iter55 : struct.games.entrySet())
          {
            oprot.writeString(_iter55.getKey());
            _iter55.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServerStateTupleSchemeFactory implements SchemeFactory {
    public ServerStateTupleScheme getScheme() {
      return new ServerStateTupleScheme();
    }
  }

  private static class ServerStateTupleScheme extends TupleScheme<ServerState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServerState struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLoggedInPlayers()) {
        optionals.set(0);
      }
      if (struct.isSetGames()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLoggedInPlayers()) {
        {
          oprot.writeI32(struct.loggedInPlayers.size());
          for (Map.Entry<String, Player> _iter56 : struct.loggedInPlayers.entrySet())
          {
            oprot.writeString(_iter56.getKey());
            _iter56.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetGames()) {
        {
          oprot.writeI32(struct.games.size());
          for (Map.Entry<String, Game> _iter57 : struct.games.entrySet())
          {
            oprot.writeString(_iter57.getKey());
            _iter57.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServerState struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map58 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.loggedInPlayers = new HashMap<String,Player>(2*_map58.size);
          for (int _i59 = 0; _i59 < _map58.size; ++_i59)
          {
            String _key60; // required
            Player _val61; // required
            _key60 = iprot.readString();
            _val61 = new Player();
            _val61.read(iprot);
            struct.loggedInPlayers.put(_key60, _val61);
          }
        }
        struct.setLoggedInPlayersIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map62 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.games = new HashMap<String,Game>(2*_map62.size);
          for (int _i63 = 0; _i63 < _map62.size; ++_i63)
          {
            String _key64; // required
            Game _val65; // required
            _key64 = iprot.readString();
            _val65 = new Game();
            _val65.read(iprot);
            struct.games.put(_key64, _val65);
          }
        }
        struct.setGamesIsSet(true);
      }
    }
  }

}
